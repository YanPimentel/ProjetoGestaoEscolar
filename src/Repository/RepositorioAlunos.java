package Repository;

import Entites.Aluno;
import Interfaces.RepositorioAlunoInterface;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlunos implements RepositorioAlunoInterface<Aluno> {
    //Repositorio para gerenciar ALUNOS
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void adicionar(Aluno aluno){
        alunos.add(aluno);
    }
    @Override
    public void remover(Aluno aluno){
        alunos.remove(aluno);
    }
    @Override
    public List<Aluno> listar(){
        return alunos;
    }


}
