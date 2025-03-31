package Repository;

import Entites.Disciplina;
import Interfaces.RepositorioDisciplinaInterface;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDisciplina implements RepositorioDisciplinaInterface<Disciplina> {
    private List<Disciplina> disciplinas = new ArrayList<>();


    @Override
    public void adicionar(Disciplina disciplina){
        disciplinas.add(disciplina);

    };

    @Override
    public void remover(Disciplina disciplina){
        disciplinas.remove(disciplina);
    };

    @Override
    public List<Disciplina> listar(){
        return disciplinas;
    }

}
