package semester03.dataStructures.p1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[15];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 0; i < 15; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 6) {
                aprovados++;
            }
        }

        double media = soma / 15;

        System.out.println();
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Alunos aprovados: " + aprovados);
    }
}

