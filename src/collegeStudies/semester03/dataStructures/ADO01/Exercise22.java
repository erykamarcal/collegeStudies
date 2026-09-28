package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE ATENDIMENTO =====");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Ver próximo cliente");
            System.out.println("4 - Mostrar fila");
            System.out.println("5 - Verificar se a fila está vazia");
            System.out.println("6 - Quantidade de clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = entrada.nextLine();

                    fila.add(nome);

                    System.out.println("Cliente adicionado à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não existem clientes na fila.");
                    } else {
                        String cliente = fila.poll();
                        System.out.println("Atendendo cliente: " + cliente);
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Não existem clientes na fila.");
                    } else {
                        System.out.println("Próximo cliente: " + fila.peek());
                    }
                    break;

                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes aguardando atendimento:");
                        System.out.println(fila);
                    }
                    break;

                case 5:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Existem clientes aguardando atendimento.");
                    }
                    break;
                case 6:
                    System.out.println("Quantidade de clientes aguardando: " + fila.size());
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}

