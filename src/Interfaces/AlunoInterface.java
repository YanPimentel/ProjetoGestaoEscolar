package Interfaces;


//import java.util.List;
//
////TODO FALTA MUDAR PRA REPOSITORIO DE ALUNOS
//
//

import Entites.Aluno;
import java.util.List;

//// Interface para definir contrato de repositórios
//
//public interface RepositorioAlunoInterface<Aluno>{
//    void adicionar(Aluno item);
//    void remover (Aluno item);
//    List<Aluno> listar();
//
//}


// Interface para serviços do Aluno
public interface AlunoInterface {
    void cadastrar(Aluno aluno);
    void atualizar(Aluno aluno);
    void remover(int id);
    List<Aluno> listar();

    // Metodo criado para validar o nome do aluno ( para que ele não digite numeros)
    boolean validarNome(String nome);



}
