package Repository;

import Entites.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepositorio implements IDisciplinaRepositorio {
    private List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    public void salvar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void remover(int id) {
        disciplinas.removeIf(disciplina -> disciplina.getId() == id);
    }

    @Override
    public void alterar(Disciplina disciplina) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getId() == disciplina.getId()) {
                disciplinas.set(i, disciplina);
                return;
            }
        }
    }

    @Override
    public List<Disciplina> listar() {
        return disciplinas;
    }
}

