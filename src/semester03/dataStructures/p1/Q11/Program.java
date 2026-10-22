package semester03.dataStructures.p1.Q11;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Cadastrar", "Emprestar", "Devolver", "Ver fila", "Ver histórico", "Ver movimentos", "Sair"};
        ArrayList<Livro> livros = new ArrayList<>();
        Queue<Livro> fila = new LinkedList<>();
        Stack<Livro> historico = new Stack<>();
        int[][] movimentos = new int[50][2];
        int opcao;

        do {
            System.out.println();
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1 && livros.size() < 50) {
                System.out.print("Código: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                livros.add(new Livro(codigo, titulo, autor));

            } else if (opcao == 2 || opcao == 3) {
                System.out.print("Código do livro: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < livros.size(); i++) {
                    Livro l = livros.get(i);
                    if (l.codigo == codigo) {
                        if (opcao == 2 && !fila.contains(l)) {
                            fila.add(l);
                            movimentos[i][0]++;
                            System.out.println("Emprestado!");
                        } else if (opcao == 3 && fila.contains(l)) {
                            fila.remove(l);
                            historico.push(l);
                            movimentos[i][1]++;
                            System.out.println("Devolvido!");
                        } else {
                            System.out.println("Operação não permitida para este livro.");
                        }
                    }
                }

            } else if (opcao == 4) {
                for (Livro l : fila) {
                    System.out.println(l.codigo + " - " + l.titulo);
                }

            } else if (opcao == 5) {
                for (int i = historico.size() - 1; i >= 0; i--) {
                    System.out.println(historico.get(i).codigo + " - " + historico.get(i).titulo);
                }

            } else if (opcao == 6) {
                for (int i = 0; i < livros.size(); i++) {
                    System.out.println(livros.get(i).titulo + ": " + movimentos[i][0]
                            + " empréstimos, " + movimentos[i][1] + " devoluções");
                }
            }

        } while (opcao != 7);
    }
}

