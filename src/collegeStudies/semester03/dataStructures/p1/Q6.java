package collegeStudies.semester03.dataStructures.p1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.println("\n\nDiagonal secundária:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
            somaSecundaria += matriz[i][4 - i];
        }

        int somaTotal = somaPrincipal + somaSecundaria;

        System.out.println("\n\nSoma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        System.out.println("Soma das diagonais: " + somaTotal);
    }
}

