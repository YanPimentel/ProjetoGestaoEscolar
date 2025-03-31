package Services;
//
//public interface ProfessorService {
//
//    static boolean validarNome(String nome) {
//        if (nome.matches(".*\\d.*")) {
//            System.out.println("Erro: O nome do professor não pode conter números.");
//            return false;
//        }
//        return true;
//    }
//
//
//}

import Entites.Professor;
import Interfaces.ProfessorInterface;
import Repository.IProfessorRepositorio;
import Repository.ProfessorRepositorio;

import java.util.List;

public class ProfessorService implements ProfessorInterface {
    private IProfessorRepositorio professorRepositorio;

    public ProfessorService() {
        this.professorRepositorio = new ProfessorRepositorio();
    }

    @Override
    public void cadastrar(Professor professor) {
        professorRepositorio.salvar(professor);
    }

    @Override
    public void atualizar(Professor professor) {
        professorRepositorio.alterar(professor);
    }

    @Override
    public void remover(int id) {
        professorRepositorio.remover(id);
    }

    @Override
    public List<Professor> listar() {
        return professorRepositorio.listar();
    }
}


