package semester03.dataStructures.p1.Q9;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Pesquisar por matrícula");
            System.out.println("4. Remover aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                Aluno a = new Aluno();

                System.out.print("Matrícula: ");
                a.matricula = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nome: ");
                a.nome = scanner.nextLine();

                System.out.print("Curso: ");
                a.curso = scanner.nextLine();

                alunos.add(a);
                System.out.println("Aluno cadastrado!");

            } else if (opcao == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    for (Aluno a : alunos) {
                        System.out.println(a.matricula + " - " + a.nome + " - " + a.curso);
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite a matrícula: ");
                int busca = scanner.nextInt();
                scanner.nextLine();
                boolean achou = false;

                for (Aluno a : alunos) {
                    if (a.matricula == busca) {
                        System.out.println("Nome: " + a.nome);
                        System.out.println("Curso: " + a.curso);
                        achou = true;
                    }
                }

                if (!achou) {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.print("Digite a matrícula do aluno a remover: ");
                int busca = scanner.nextInt();
                scanner.nextLine();
                boolean achou = false;

                for (int i = 0; i < alunos.size(); i++) {
                    if (alunos.get(i).matricula == busca) {
                        alunos.remove(i);
                        System.out.println("Aluno removido!");
                        achou = true;
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");

            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
    }
}

