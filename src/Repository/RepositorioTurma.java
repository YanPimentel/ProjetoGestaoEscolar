package Repository;


import Entites.Turma;
import Interfaces.RepositorioAlunoInterface;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTurma implements RepositorioAlunoInterface<Turma> {
    private List<Turma> turmas = new ArrayList<>();

    public void adicionar(Turma turma){
        turmas.add(turma);

    }

    public void remover(Turma turma){
        turmas.remove(turma);
    }


    public List<Turma> listar(){
        return turmas;
    }

}
