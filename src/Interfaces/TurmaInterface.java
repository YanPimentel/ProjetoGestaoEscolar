package Interfaces;


import Entites.Turma;
import java.util.List;

public interface TurmaInterface {
    void cadastrar(Turma turma);
    void atualizar(Turma turma);
    void remover(int id);
    List<Turma> listar();
}

