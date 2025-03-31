package Services;

//public interface AlunoService {
//
//    static boolean validarNome(String nome) {
//        if (nome.matches(".*\\d.*")) {
//            System.out.println("Erro: O nome do aluno não pode conter números.");
//            return false;
//        }
//        return true;
//    }
//
//    // Validação para a série do aluno
//    static boolean validarSerie(int serie) {
//        if (serie <= 0 || serie > 9) {
//            System.out.println("Erro: Série inválida. A série deve ser entre 1 e 9.");
//            return false;
//        }
//        return true;
//    }
//}
//
//

import Entites.Aluno;
import Interfaces.AlunoInterface;
import Repository.AlunoRepositorio;
import Repository.IAlunoRepositorio;

import java.util.List;

public class AlunoService implements AlunoInterface {
    private IAlunoRepositorio alunoRepositorio;

    public AlunoService() {
        this.alunoRepositorio = new AlunoRepositorio();
    }

    @Override
    public void cadastrar(Aluno aluno) {
        alunoRepositorio.salvar(aluno);
    }

    @Override
    public void atualizar(Aluno aluno) {
        alunoRepositorio.alterar(aluno);
    }

    @Override
    public void remover(int id) {
        alunoRepositorio.remover(id);
    }

    @Override
    public List<Aluno> listar() {
        return alunoRepositorio.listar();
    }
}


