package Interfaces;
import Entites.Professor;
import java.util.List;


// Interface para servicos do professor
public interface ProfessorInterface {
    void cadastrar(Professor professor);
    void atualizar(Professor professor);
    void remover(int id);
    List<Professor> listar();
}
