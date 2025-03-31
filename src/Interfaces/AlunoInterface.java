package Interfaces;
import Entites.Aluno;
import java.util.List;



// Interface para serviços do Aluno
public interface AlunoInterface {
    void cadastrar(Aluno aluno);
    void atualizar(Aluno aluno);
    void remover(int id);
    List<Aluno> listar();

    // Metodo criado para validar o nome do aluno ( para que ele não digite numeros)
    boolean validarNome(String nome);



}
