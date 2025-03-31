package Repository;

import Entites.Aluno;
import java.util.List;

 public interface IAlunoRepositorio  {
    void salvar(Aluno aluno);

    void alterar(Aluno aluno);

    void remover(int id);

    List<Aluno> listar();
}

