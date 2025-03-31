package Services;

//import Entites.Professor;
//import Repository.RepositorioProfessor;
//
//public interface DisciplinaService {
//
//    // Verificar se o professor está registrado.
//    static boolean verificarProfessorRegistrado(String nomeProfessor, RepositorioProfessor repositorioProfessor) {
//        for (Professor professor : repositorioProfessor.listar()) {
//            if (professor.getNome().equalsIgnoreCase(nomeProfessor)) {
//                return true; // Professor encontrado
//            }
//        }
//        return false; // Professor não encontrado
//    }
//}
//
//
//
//
//
//

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



