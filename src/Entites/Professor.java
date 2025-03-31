package Entites;

public class Professor extends Pessoa {
    private int idProfessor;
    private String especialidade;

    public Professor(){

    }

    public Professor(int idProfessor, String especialidade) {
        this.idProfessor = idProfessor;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome do Professor: " + getNome());
        System.out.println("Especialidade do Professor: " + especialidade);

    };


    public void consultarId(){
        System.out.println("ID do professor: " + idProfessor);
    }



}
