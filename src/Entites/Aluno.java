//package Entites;
//
//public class Aluno extends Pessoa {
//    private int idAluno;
//    private int serie;
//
//    public Aluno(){}
//
//    public Aluno(String nome, int serie){
//        super(nome);
//        this.serie = serie;
//    }
//
//    public Aluno(int idAluno,int serie){
//        this.idAluno = idAluno;
//        this.serie = serie;
//    }
//
//    public Aluno(String nome, int idade, String cpf, int idAluno, int serie) {
//        super(nome);
//        this.idAluno = idAluno;
//        this.serie = serie;
//    }
//
//
//    public int getIdAluno() {
//        return idAluno;
//    }
//
//    public void setIdAluno(int idAluno) {
//        this.idAluno = idAluno;
//    }
//
//    public int getSerie() {
//        return serie;
//    }
//
//    public void setSerie(int serie) {
//        this.serie = serie;
//    }
//
//    @Override
//    public void exibirInformacoes(){  // Pode fazer sem o Override, mas o override é uma boa pratica para não ter erros.
//        System.out.println("Aluno : " + getNome());
//        System.out.println("ID do aluno : " + idAluno);
//        System.out.println("Serie : " + serie);
//    };

//
//
//
//
//
//
//}


package Entites;
public class Aluno extends Pessoa {
    private int idade;

    public Aluno() {}

    public Aluno(int id, String nome, int idade) {
        super(id, nome);
        this.idade = idade;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return  "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
    }
}








