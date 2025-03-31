package Repository;

import Entites.Professor;
import java.util.List;

public interface IProfessorRepositorio {
    void salvar(Professor professor);

    void alterar(Professor professor);

    void remover(int id);

    List<Professor> listar();
}
