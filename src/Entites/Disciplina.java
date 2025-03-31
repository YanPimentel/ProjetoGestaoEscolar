//package Entites;
//
//public class Disciplina {
//    private String nome;
//    private Professor professorResponsavel;
//
//    public Disciplina(){}
//
//    public Disciplina(String nome, Professor professorResponsavel){
//        this.nome = nome;
//        this.professorResponsavel = professorResponsavel;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public Professor getProfessorResponsavel() {
//        return professorResponsavel;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setProfessorResponsavel(Professor professorResponsavel) {
//        this.professorResponsavel = professorResponsavel;
//    }
//}

package Entites;
public class Disciplina {
    private int id;
    private String nome;

    public Disciplina() {}

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return  "ID: " + id + ", Nome: " + nome ;
    }
}



