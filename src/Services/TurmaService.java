package Services;
import Entites.Turma;
import Interfaces.TurmaInterface;
import Repository.ITurmaRepositorio;
import Repository.TurmaRepositorio;

import java.util.List;

public class TurmaService implements TurmaInterface {
    private ITurmaRepositorio turmaRepositorio;

    public TurmaService() {
        this.turmaRepositorio = new TurmaRepositorio();
    }

    @Override
    public void cadastrar(Turma turma) {
        turmaRepositorio.salvar(turma);
    }

    @Override
    public void atualizar(Turma turma) {
        turmaRepositorio.alterar(turma);
    }

    @Override
    public void remover(int id) {
        turmaRepositorio.remover(id);
    }

    @Override
    public List<Turma> listar() {
        return turmaRepositorio.listar();
    }
}