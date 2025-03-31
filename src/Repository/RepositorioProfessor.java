package Repository;

import Entites.Professor;
import Interfaces.RepositorioAlunoInterface;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProfessor implements RepositorioAlunoInterface<Professor> {
    private List<Professor> professores = new ArrayList<>();

    @Override
    public void adicionar(Professor professor){
        professores.add(professor);

    }
    @Override
    public void remover(Professor professor){
        professores.remove(professor);

    }
    @Override
    public List<Professor> listar(){
        return professores;
    }
}
