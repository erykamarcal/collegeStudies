package semester03.dataStructures.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1. Inserir");
            System.out.println("2. Ordenar");
            System.out.println("3. Pesquisar");
            System.out.println("4. Remover");
            System.out.println("5. Exibir");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Cidade: ");
                cidades.add(sc.nextLine());
            } else if (opcao == 2) {
                Collections.sort(cidades);
            } else if (opcao == 3) {
                System.out.print("Cidade: ");
                if (cidades.contains(sc.nextLine())) {
                    System.out.println("Encontrada!");
                } else {
                    System.out.println("Não encontrada.");
                }
            } else if (opcao == 4) {
                System.out.print("Cidade: ");
                cidades.remove(sc.nextLine());
            } else if (opcao == 5) {
                System.out.println(cidades);
            }
        } while (opcao != 6);
    }
}