package Interfaces;
import Entites.Disciplina;
import java.util.List;


// Interface para serviços da disciplina
public interface DisciplinaInterface {
    void cadastrar(Disciplina disciplina);
    void atualizar(Disciplina disciplina);
    void remover(int id);
    List<Disciplina> listar();
}

