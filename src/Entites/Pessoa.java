package Entites;



// Classe abstrata de pessoas
public abstract class Pessoa { // Criando Classe abstrata, para herdar para seus filhos os seus atributos e metodos
    private String nome;


    public Pessoa(){

    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void exibirInformacoes();



}
