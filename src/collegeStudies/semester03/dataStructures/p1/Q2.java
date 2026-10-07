package collegeStudies.semester03.dataStructures.p1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Nomes cadastrados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
    }
}