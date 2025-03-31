package Repository;

import Entites.Turma;
import java.util.List;

public interface ITurmaRepositorio {
    void salvar(Turma turma);
    void alterar(Turma turma);
    void remover(int id);
    List<Turma> listar();
}
