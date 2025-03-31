package Services;

public interface ProfessorService {

    static boolean validarNome(String nome) {
        if (nome.matches(".*\\d.*")) {
            System.out.println("Erro: O nome do professor não pode conter números.");
            return false;
        }
        return true;
    }


}
