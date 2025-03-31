package Repository;

import Entites.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepositorio implements IProfessorRepositorio {
    private List<Professor> professores = new ArrayList<>();

    @Override
    public void salvar(Professor professor) {
        professores.add(professor);
    }

    @Override
    public void remover(int id) {
        professores.removeIf(professor -> professor.getId() == id);
    }

    @Override
    public void alterar(Professor professor) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getId() == professor.getId()) {
                professores.set(i, professor);
                return;
            }
        }
    }

    @Override
    public List<Professor> listar() {
        return professores;
    }
}
