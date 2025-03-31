package Interfaces;

import Entites.Disciplina;

import java.util.List;

public interface RepositorioDisciplinaInterface<Disciplina> {

    void adicionar(Disciplina disciplina);

    void remover(Disciplina disciplina);

    List<Disciplina> listar();

}
