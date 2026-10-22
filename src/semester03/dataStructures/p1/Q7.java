package semester03.dataStructures.p1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[][] vendas = new double[4][7];
        double[] totalVendedor = new double[4];
        double[] totalDia = new double[7];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Vendedor " + (i + 1) + " - " + dias[j] + ": R$ ");
                vendas[i][j] = scanner.nextDouble();
                totalVendedor[i] += vendas[i][j];
                totalDia[j] += vendas[i][j];
            }
        }

        System.out.println("\nTotal vendido por vendedor:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Vendedor " + (i + 1) + ": R$ " + totalVendedor[i]);
        }

        System.out.println();
        System.out.println("Total vendido por dia:");
        for (int j = 0; j < 7; j++) {
            System.out.println(dias[j] + ": R$ " + totalDia[j]);
        }

        int melhor = 0;
        for (int i = 1; i < 4; i++) {
            if (totalVendedor[i] > totalVendedor[melhor]) {
                melhor = i;
            }
        }

        System.out.println();
        System.out.println("Vendedor que mais vendeu: Vendedor " + (melhor + 1)
                + " (R$ " + totalVendedor[melhor] + ")");
    }
}

