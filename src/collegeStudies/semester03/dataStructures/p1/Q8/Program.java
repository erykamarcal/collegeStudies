package collegeStudies.semester03.dataStructures.p1.Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        String opcao;

        do {
            Produto p = new Produto();

            System.out.print("Código: ");
            p.codigo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            p.nome = sc.nextLine();

            System.out.print("Preço: R$ ");
            p.preco = sc.nextDouble();
            sc.nextLine();

            produtos.add(p);

            System.out.print("Cadastrar outro? (s/n): ");
            opcao = sc.nextLine();
        } while (opcao.equals("s"));

        Produto maisCaro = produtos.get(0);
        Produto maisBarato = produtos.get(0);
        double soma = 0;

        for (Produto p : produtos) {
            if (p.preco > maisCaro.preco) {
                maisCaro = p;
            }
            if (p.preco < maisBarato.preco) {
                maisBarato = p;
            }
            soma += p.preco;
        }

        System.out.println("\nMais caro: " + maisCaro.nome + " - R$ " + maisCaro.preco);
        System.out.println("Mais barato: " + maisBarato.nome + " - R$ " + maisBarato.preco);
        System.out.println("Média de preços: R$ " + soma / produtos.size());
        System.out.println("Total de produtos: " + produtos.size());
    }
}
