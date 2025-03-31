package Repository;

import Entites.Disciplina;
import java.util.List;

public interface IDisciplinaRepositorio {
    void salvar(Disciplina disciplina);

    void alterar(Disciplina disciplina);

    void remover(int id);

    List<Disciplina> listar();
}