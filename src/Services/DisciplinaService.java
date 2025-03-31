package Services;

import Entites.Professor;
import Repository.RepositorioProfessor;

public interface DisciplinaService {

    // Verificar se o professor está registrado.
    static boolean verificarProfessorRegistrado(String nomeProfessor, RepositorioProfessor repositorioProfessor) {
        for (Professor professor : repositorioProfessor.listar()) {
            if (professor.getNome().equalsIgnoreCase(nomeProfessor)) {
                return true; // Professor encontrado
            }
        }
        return false; // Professor não encontrado
    }
}






