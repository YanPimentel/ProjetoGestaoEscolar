package Services;
import Entites.Disciplina;
import Interfaces.DisciplinaInterface;
import Repository.DisciplinaRepositorio;
import Repository.IDisciplinaRepositorio;

import java.util.List;

public class DisciplinaService implements DisciplinaInterface {
    private IDisciplinaRepositorio disciplinaRepositorio;

    public DisciplinaService() {
        this.disciplinaRepositorio = new DisciplinaRepositorio();
    }

    @Override
    public void cadastrar(Disciplina disciplina) {
        disciplinaRepositorio.salvar(disciplina);
    }

    @Override
    public void atualizar(Disciplina disciplina) {
        disciplinaRepositorio.alterar(disciplina);
    }

    @Override
    public void remover(int id) {
        disciplinaRepositorio.remover(id);
    }

    @Override
    public List<Disciplina> listar() {
        return disciplinaRepositorio.listar();
    }
}



