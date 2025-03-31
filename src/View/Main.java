package View;
import Entites.Aluno;
import Entites.Disciplina;
import Entites.Professor;
import Entites.Turma;
import Services.AlunoService;
import Services.DisciplinaService;
import Services.ProfessorService;
import Services.TurmaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando os serviços ( Instanciando )
        AlunoService alunoService = new AlunoService();
        DisciplinaService disciplinaService = new DisciplinaService();
        ProfessorService professorService = new ProfessorService();
        TurmaService turmaService = new TurmaService();

        int opcao;


        do {
            System.out.println("\n===== Sistema Escolar =====");
            System.out.println("⬇\uFE0FESCOLHA UMA DAS OPÇÕES ABAIXO⬇\uFE0F");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Remover Aluno");
            System.out.println("5. Cadastrar Disciplina");
            System.out.println("6. Listar Disciplinas");
            System.out.println("7. Atualizar Disciplina");
            System.out.println("8. Remover Disciplina");
            System.out.println("9. Cadastrar Professor");
            System.out.println("10. Listar Professores");
            System.out.println("11. Atualizar Professor");
            System.out.println("12. Remover Professor");
            System.out.println("13. Cadastrar Turma");
            System.out.println("14. Listar Turmas");
            System.out.println("15. Atualizar Turma");
            System.out.println("16. Remover Turma");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            int id;
            String nome;

            switch (opcao){
                // Opção para cadastrar aluno
                case 1:
                    System.out.println("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    alunoService.cadastrar(new Aluno(id,nome,idade));
                    break;
                case 2:
                    // Opção para listar os alunos
                    for (Aluno alunos : alunoService.listar())
                        System.out.println(alunos);
                    break;
                case 3:
                    // Atualizar Aluno
                    System.out.print("ID do aluno a atualizar: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo Nome: "); nome = sc.nextLine();
                    System.out.print("Nova Idade: "); idade = sc.nextInt();
                    alunoService.atualizar(new Aluno(id, nome, idade));
                    System.out.println("Aluno atualizado com sucesso!");
                    break;

                case 4:
                    // Remover Aluno
                    System.out.print("ID do aluno a remover: "); id = sc.nextInt();
                    alunoService.remover(id);
                    System.out.println("Aluno removido com sucesso!");
                    break;

                case 5:
                    // Cadastro de Disciplina
                    System.out.print("ID: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome da Disciplina: "); nome = sc.nextLine();
                    disciplinaService.cadastrar(new Disciplina(id, nome));
                    System.out.println("Disciplina cadastrada com sucesso!");
                    break;

                case 6:
                    // Listar Disciplinas
                    for (Disciplina d : disciplinaService.listar()) System.out.println(d);
                    break;

                case 7:
                    // Atualizar Disciplina
                    System.out.print("ID da disciplina a atualizar: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: "); nome = sc.nextLine();
                    disciplinaService.atualizar(new Disciplina(id, nome));
                    System.out.println("Disciplina atualizada com sucesso!");
                    break;

                case 8:
                    // Remover Disciplina
                    System.out.print("ID da disciplina a remover: "); id = sc.nextInt();
                    disciplinaService.remover(id);
                    System.out.println("Disciplina removida com sucesso!");
                    break;

                case 9:
                    // Cadastro de Professor
                    System.out.print("ID: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: "); nome = sc.nextLine();
                    System.out.print("Especialidade: "); String especialidade = sc.nextLine();
                    professorService.cadastrar(new Professor(id, nome, especialidade));
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 10:
                    // Listar Professores
                    for (Professor p : professorService.listar()) System.out.println(p);
                    break;

                case 11:
                    // Atualizar Professor
                    System.out.print("ID do professor a atualizar: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: "); nome = sc.nextLine();
                    System.out.print("Nova especialidade: "); especialidade = sc.nextLine();
                    professorService.atualizar(new Professor(id, nome, especialidade));
                    System.out.println("Professor atualizado com sucesso!");
                    break;

                case 12:
                    // Remover Professor
                    System.out.print("ID do professor a remover: "); id = sc.nextInt();
                    professorService.remover(id);
                    System.out.println("Professor removido com sucesso!");
                    break;

                case 13:
                    // Cadastro de Turma
                    System.out.print("ID: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome da Turma: "); nome = sc.nextLine();
                    turmaService.cadastrar(new Turma(id, nome));
                    System.out.println("Turma cadastrada com sucesso!");
                    break;

                case 14:
                    // Listar Turmas
                    for (Turma t : turmaService.listar()) System.out.println(t);
                    break;

                case 15:
                    // Atualizar Turma
                    System.out.print("ID da turma a atualizar: "); id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: "); nome = sc.nextLine();
                    turmaService.atualizar(new Turma(id, nome));
                    System.out.println("Turma atualizada com sucesso!");
                    break;

                case 16:
                    // Remover Turma
                    System.out.print("ID da turma a remover: "); id = sc.nextInt();
                    turmaService.remover(id);
                    System.out.println("Turma removida com sucesso!");
                    break;

                case 0:
                    // Encerrar o programa
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao!=0);

        sc.close();

            }

        }


