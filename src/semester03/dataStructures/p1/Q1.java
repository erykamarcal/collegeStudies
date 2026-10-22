package semester03.dataStructures.p1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 20; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = soma / 20.0;

        System.out.println("Números digitados:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
