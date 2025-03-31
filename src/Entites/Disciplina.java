package Entites;

public class Disciplina {
    private String nome;
    private Professor professorResponsavel;

    public Disciplina(){}

    public Disciplina(String nome, Professor professorResponsavel){
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
