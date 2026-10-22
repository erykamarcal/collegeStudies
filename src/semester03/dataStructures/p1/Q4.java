package semester03.dataStructures.p1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[12];
        int[] pares = new int[12];
        int[] impares = new int[12];
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

            if (valores[i] % 2 == 0) {
                pares[qtdPares] = valores[i];
                qtdPares++;
            } else {
                impares[qtdImpares] = valores[i];
                qtdImpares++;
            }
        }

        System.out.println();
        System.out.print("Vetor original: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor de pares: ");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor de ímpares: ");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}

