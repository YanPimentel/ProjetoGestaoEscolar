package Entites;

import java.util.List;

public class Turma {
    private String id;
    private String nomeTurma;
    private int capacidade;

   public Turma(){

   }


   public Turma(String nomeTurma, int capacidade){
       this.nomeTurma = nomeTurma;
       this.capacidade = capacidade;
   }

    public Turma(String id, String nomeTurma){
        this.id = id;
        this.nomeTurma = nomeTurma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void consultarID(){
        System.out.println("ID DA TURMA: " + getId());
    }



}
