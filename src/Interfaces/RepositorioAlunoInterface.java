package Interfaces;


import java.util.List;

//TODO FALTA MUDAR PRA REPOSITORIO DE ALUNOS


// Interface para definir contrato de repositórios

public interface RepositorioAlunoInterface<Aluno>{
    void adicionar(Aluno item);
    void remover (Aluno item);
    List<Aluno> listar();

}
