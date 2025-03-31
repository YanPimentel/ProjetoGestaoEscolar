//package Entites;
//
//import java.util.List;
//
//public class Turma {
//    private String id;
//    private String nomeTurma;
//    private int capacidade;
//
//   public Turma(){
//
//   }
//
//
//   public Turma(String nomeTurma, int capacidade){
//       this.nomeTurma = nomeTurma;
//       this.capacidade = capacidade;
//   }
//
//    public Turma(String id, String nomeTurma){
//        this.id = id;
//        this.nomeTurma = nomeTurma;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getNomeTurma() {
//        return nomeTurma;
//    }
//
//    public void setNomeTurma(String nomeTurma) {
//        this.nomeTurma = nomeTurma;
//    }
//
//    public int getCapacidade() {
//        return capacidade;
//    }
//
//    public void setCapacidade(int capacidade) {
//        this.capacidade = capacidade;
//    }
//
//    public void consultarID(){
//        System.out.println("ID DA TURMA: " + getId());
//    }
//
//
//
//}

package Entites;
public class Turma {
    private int id;
    private String nome;

    public Turma() {

    }

    public Turma(int id, String nome) {
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
