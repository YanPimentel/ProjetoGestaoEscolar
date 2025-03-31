package Repository;

import Entites.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaRepositorio implements ITurmaRepositorio {
    private List<Turma> turmas = new ArrayList<>();

    @Override
    public void salvar(Turma turma) {
        turmas.add(turma);
    }

    @Override
    public void remover(int id) {
        turmas.removeIf(turma -> turma.getId() == id);
    }

    @Override
    public void alterar(Turma turma) {
        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getId() == turma.getId()) {
                turmas.set(i, turma);
                return;
            }
        }
    }

    @Override
    public List<Turma> listar() {
        return turmas;
    }
}
