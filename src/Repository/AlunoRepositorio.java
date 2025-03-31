package Repository;
import Entites.Aluno;
import Repository.IAlunoRepositorio;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorio implements IAlunoRepositorio {
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void remover(int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }

    @Override
    public void alterar(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() == aluno.getId()) {
                alunos.set(i, aluno);
                return;
            }
        }
    }

    @Override
    public List<Aluno> listar() {
        return alunos;
    }
}
