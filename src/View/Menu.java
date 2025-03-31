package View;

import Entites.Aluno;
import Entites.Disciplina;
import Entites.Professor;
import Entites.Turma;
import Repository.RepositorioAlunos;
import Repository.RepositorioDisciplina;
import Repository.RepositorioProfessor;
import Repository.RepositorioTurma;
import Services.AlunoService;
import Services.DisciplinaService;
import Services.ProfessorService;
import Services.TurmaService;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TODO TENHO QUE CRIAR UM METODO PARA EDITAR ,ALUNO,PROFESSOR,TURMA E DISCILPINA (E OUTRO METODO PARA  EXCLUIR)

// Classe de interação com o usuário
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private RepositorioAlunos repositorioAlunos = new RepositorioAlunos();
    private RepositorioProfessor repositorioProfessor = new RepositorioProfessor();
    private RepositorioTurma repositorioTurma = new RepositorioTurma();
    private RepositorioDisciplina repositorioDisciplina = new RepositorioDisciplina();

    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- \uD83C\uDFEB BEM VINDO \uD83C\uDFEB ---");
            System.out.println("⬇\uFE0FESCOLHA UMA DAS OPÇÕES ABAIXO⬇\uFE0F");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Adicionar Professor");
            System.out.println("3. Adicionar Turma");
            System.out.println("4. Adicionar Disciplina");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Turmas");
            System.out.println("7. Listar Professores");
            System.out.println("8. Listar Disciplinas");
            System.out.println("9. Editar Aluno");
            System.out.println("10. Editar Professor");
            System.out.println("11. Editar Turma");
            System.out.println("12. Editar Disciplina");
            System.out.println("13. Remover Aluno");
            System.out.println("14. Remover Professor");
            System.out.println("15. Remover Turma");
            System.out.println("16. Remover Disciplina");
            System.out.println("17. Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    adicionarProfessor();
                    break;
                case 3:
                    adicionarTurma();
                    break;
                case 4:
                    adicionarDisciplina();
                    break;
                case 5:
                    listarAlunos();
                    break;
                case 6:
                    listarTurmas();
                    break;
                case 7:
                    listarProfessores();
                    break;
                case 8:
                    listarDisciplinas();
                    break;
                case 9:
                    editarAluno();
                    break;
                case 10:
                    editarProfessor();
                    break;
                case 11:
                    editarTurmas();
                    break;
                case 12:
                    editarDisciplina();
                    break;
                case 13:
                    removerAluno();
                    break;
                case 14:
                    removerProfessor();
                    break;
                case 15:
                    removerTurma();
                    break;
                case 16:
                    removerDisciplina();
                    break;
                case 17:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void adicionarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        // Usando o serviço para validação do nome
        if (!AlunoService.validarNome(nome)) {
            return; // Se o nome for invalido ele já para aqui.
        }

        int serie = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Serie: ");
            if (scanner.hasNextInt()) {
                serie = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida! Digite um número válido para a serie.");
                scanner.next();
            }
        }
        scanner.nextLine();


        Aluno aluno = new Aluno(nome, serie);
        repositorioAlunos.adicionar(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno aluno : repositorioAlunos.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Série: " + aluno.getSerie());
        }
    }

    private void editarAluno() {
        System.out.println("Digite o nome do aluno que deseja editar: ");
        String nomeAntigo = scanner.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : repositorioAlunos.listar()) {
            if (aluno.getNome().equalsIgnoreCase(nomeAntigo)) {
                alunoEncontrado = aluno;
                break;
            }
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }

        System.out.println("Novo nome do aluno: ");
        String novoNome = scanner.nextLine();

        System.out.println("Nova serie do aluno: ");
        int novaSerie = scanner.nextInt();
        scanner.nextLine();

        alunoEncontrado.setNome(novoNome);
        alunoEncontrado.setSerie(novaSerie);

        System.out.println("Alteração bem sucedida! :)");

    }

    //Excluir
    private void removerAluno() {
        System.out.print("Digite o nome do aluno a ser removido: ");
        String nome = scanner.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : repositorioAlunos.listar()) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunoEncontrado = aluno;
                break;
            }
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }

        // Remover o aluno do repositório
        repositorioAlunos.remover(alunoEncontrado);
        System.out.println("Aluno " + alunoEncontrado.getNome() + " removido com sucesso!");
    }


    private void adicionarProfessor() {
        System.out.println("Nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        // Usando o serviço para validação do nome
        if (!ProfessorService.validarNome(nomeProfessor)) {
            return; // Se o nome for invalido ele já para aqui.
        }


        System.out.println("Especialidade do professor: ");
        String especialidadeProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, especialidadeProfessor);
        repositorioProfessor.adicionar(professor);
    }

    private void listarProfessores() {
        System.out.println("\n--- Lista de Professores ---");
        for (Professor professor : repositorioProfessor.listar()) {
            System.out.println("\u001B[31mNome: " + professor.getNome() + ", ESPECIALIDADE: " + professor.getEspecialidade() + "\u001B[0m");
        }
    }

    private void editarProfessor() {
        System.out.println("Digite o nome do professor que deseja editar: ");
        String nomeAntigoProfessor = scanner.nextLine();

        Professor ProfessorEncontrado = null;
        for (Professor professor : repositorioProfessor.listar()) {
            if (professor.getNome().equalsIgnoreCase(nomeAntigoProfessor)) {
                ProfessorEncontrado = professor;
                break;
            }
        }

        if (ProfessorEncontrado == null) {
            System.out.println("Professor não encontrado!");
            return;
        }

        System.out.println("Novo nome do professor: ");
        String novoNome = scanner.nextLine();

        System.out.println("Nova serie do professor: ");
        String novaEspecialidade = scanner.nextLine();
        scanner.nextLine();

        ProfessorEncontrado.setNome(novoNome);
        ProfessorEncontrado.setEspecialidade(novaEspecialidade);

        System.out.println("Alteração bem sucedida! :)");

    }

    // Metodo para remover professor
    private void removerProfessor() {
        System.out.print("Digite o nome do professor a ser removido: ");
        String nome = scanner.nextLine();

        Professor professorEncontrado = null;
        for (Professor professor : repositorioProfessor.listar()) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                professorEncontrado = professor;
                break;
            }
        }

        if (professorEncontrado == null) {
            System.out.println("Professor não encontrado!");
            return;
        }

        // Remover o professor do repositório
        repositorioProfessor.remover(professorEncontrado);
        System.out.println("Professor " + professorEncontrado.getNome() + " removido com sucesso!");
    }

    private void adicionarTurma() {
        System.out.println("Digite o nome da turma: ");
        String nomeTurmas = scanner.nextLine();


        System.out.println("Digite a capacidade total da turma: ");
        int capacidadeTurmas = scanner.nextInt();

        Turma turma = new Turma(nomeTurmas, capacidadeTurmas);
        repositorioTurma.adicionar(turma);
    }

    public void listarTurmas() {
        System.out.println("\n --- Lista de Turmas ---");
        for (Turma turma : repositorioTurma.listar()) {
            System.out.println("\u001B[31mNome da turma: " + turma.getNomeTurma() + ", CAPACIDADE TOTAL: " + turma.getCapacidade() + "\u001B[0m");
        }
    }

    private void editarTurmas() {
        System.out.println("Digite o nome da turma que deseja editar: ");
        String nomeAntigoTurma = scanner.nextLine();

        Turma TurmaEncontrada = null;
        for (Turma turma : repositorioTurma.listar()) {
            if (turma.getNomeTurma().equalsIgnoreCase(nomeAntigoTurma)) {
                TurmaEncontrada = turma;
                break;
            }
        }

        if (TurmaEncontrada == null) {
            System.out.println("Turma não encontrada!");
            return;
        }

        System.out.println("Nova nome da turma: ");
        String novoNome = scanner.nextLine();

        System.out.println("Nova capacidade da turma: ");
        int novaCapacidade = scanner.nextInt();
        scanner.nextLine();

        TurmaEncontrada.setNomeTurma(novoNome);
        TurmaEncontrada.setCapacidade(novaCapacidade);

        System.out.println("Alteração bem sucedida! :)");

    }

    // Metodo para remover turma
    private void removerTurma() {
        System.out.print("Digite o nome da turma a ser removida: ");
        String nome = scanner.nextLine();

        Turma turmaEncontrada = null;
        for (Turma turma : repositorioTurma.listar()) {
            if (turma.getNomeTurma().equalsIgnoreCase(nome)) {
                turmaEncontrada = turma;
                break;
            }
        }

        if (turmaEncontrada == null) {
            System.out.println("Turma não encontrada!");
            return;
        }

        // Remover a turma do repositório
        repositorioTurma.remover(turmaEncontrada);
        System.out.println("Turma " + turmaEncontrada.getNomeTurma() + " removida com sucesso!");
    }


    public void adicionarDisciplina() {
        System.out.println("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        System.out.println("Nome do professor responsável pela disciplina: ");
        String nomeProfessor = scanner.nextLine();

        if (!DisciplinaService.verificarProfessorRegistrado(nomeProfessor, repositorioProfessor)) {
            System.out.println("Professor não encontrado, Primeiro cadastre o professor para poder colocar ele em uma disciplina.");
            return;
        }

        Professor professorEncontrado = null;
        for (Professor professor : repositorioProfessor.listar()) {
            if (professor.getNome().equalsIgnoreCase(nomeProfessor)) {
                professorEncontrado = professor;
                break;
            }
        }

        Disciplina disciplina = new Disciplina(nomeDisciplina, professorEncontrado);
        repositorioDisciplina.adicionar(disciplina);
    }


    public void listarDisciplinas() {
        System.out.println("\n --- Lista de Disciplinas ---");
        for (Disciplina disciplina : repositorioDisciplina.listar()) {
            System.out.println("Disciplina: " + disciplina.getNome() + " , Professor: " + disciplina.getProfessorResponsavel().getNome());
        }
    }

    private void editarDisciplina() {
        System.out.println("Digite o nome da disciplina que deseja editar: ");
        String nomeAntigoDisciplina = scanner.nextLine();

        Disciplina disciplinaEncontrada = null;
        for (Disciplina disciplina : repositorioDisciplina.listar()) {
            if (disciplina.getNome().equalsIgnoreCase(nomeAntigoDisciplina)) {
                disciplinaEncontrada = disciplina;
                break;
            }
        }

        if (disciplinaEncontrada == null) {
            System.out.println("Disciplina não encontrado!");
            return;
        }

        System.out.println("Novo nome da disciplina: ");
        String novoNomeDisciplina = scanner.nextLine();

        disciplinaEncontrada.setNome(novoNomeDisciplina);

        System.out.println("Alteração bem sucedida! :)");

    }

    // Metodo para remover disciplina
    private void removerDisciplina() {
        System.out.print("Digite o nome da disciplina a ser removida: ");
        String nome = scanner.nextLine();

        Disciplina disciplinaEncontrada = null;
        for (Disciplina disciplina : repositorioDisciplina.listar()) {
            if (disciplina.getNome().equalsIgnoreCase(nome)) {
                disciplinaEncontrada = disciplina;
                break;
            }
        }

        if (disciplinaEncontrada == null) {
            System.out.println("Disciplina não encontrada!");
            return;
        }

        // Remover a disciplina do repositório
        repositorioDisciplina.remover(disciplinaEncontrada);
        System.out.println("Disciplina " + disciplinaEncontrada.getNome() + " removida com sucesso!");
    }
}







