package Services;
import Entites.Aluno;
import Interfaces.AlunoInterface;
import Repository.AlunoRepositorio;
import Repository.IAlunoRepositorio;

import java.util.List;

public class AlunoService implements AlunoInterface {
    private IAlunoRepositorio alunoRepositorio;

    public AlunoService() {
        this.alunoRepositorio = new AlunoRepositorio();
    }

    @Override
    public void cadastrar(Aluno aluno) {
        if (!validarNome(aluno.getNome())) {
            System.out.println("Erro: O nome do aluno não pode conter números.");
            return;
        }

        alunoRepositorio.salvar(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Aluno aluno) {
        alunoRepositorio.alterar(aluno);
    }

    @Override
    public void remover(int id) {
        alunoRepositorio.remover(id);
    }

    @Override
    public List<Aluno> listar() {
        return alunoRepositorio.listar();
    }

    @Override
    public boolean validarNome(String nome) {
        return !nome.matches(".*\\d.*"); // Retorna falso se houver números no nome
        // Nome Matches verifica se a string NOME contem pelo menos um número, se tiver o metodo matches
        // Vai retornar verdadeiro mas como tem o sinal de (!) que inverte o valor para falso, ele impede o cadastro.
        //  Se o usuario nao digitar nenhum numero e digitar o nome certinho ai o metodo retorna true, e consegue realizar o cadastro.
    }


}


