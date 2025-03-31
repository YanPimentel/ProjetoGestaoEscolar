//package Entites;
//
//
//
//// Classe abstrata de pessoas
//public abstract class Pessoa { // Criando Classe abstrata, para herdar para seus filhos os seus atributos e metodos
//    private String nome;
//
//
//    public Pessoa(){
//
//    }
//
//    public Pessoa(String nome){
//        this.nome = nome;
//    }
//
//    public String getNome(){
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public abstract void exibirInformacoes();
//
//
//
//}

package Entites;
abstract class Pessoa {
    protected int id;
    protected String nome;

    public Pessoa() {}

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
