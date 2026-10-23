package semester03.objectOrientedProgramming.game.model.application;

import semester03.objectOrientedProgramming.game.model.entities.*;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu herói: ");
        String nome = scanner.nextLine();

        System.out.println(nome + ", escolha sua arma de curta distância: 1) Faca  2) Porrete");
        Arma curta;
        if (scanner.nextInt() == 1) {
            curta = new Faca();
        } else {
            curta = new Porrete();
        }

        System.out.println("e sua arma de longa distância: 1) Arco e flecha  2) Pistola");
        Arma longa;
        if (scanner.nextInt() == 1) {
            longa = new ArcoEFlecha();
        } else {
            longa = new Pistola();
        }

        Jogador jogador = new Jogador(nome, new Arma[]{curta, longa});

        Inimigo[] inimigos = {new Stormtrooper(), new DarthMaul(), new DarthVader()};
        String[] resultados = new String[3];
        int total = 0;


        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                jogador.upgrade();
            }

            Batalha batalha = new Batalha(jogador, inimigos[i]);
            boolean venceu = batalha.lutar();

            resultados[i] = "Batalha " + (i + 1) + ": " + batalha.getResultado();
            total++;

            if (!venceu) {
                break;
            }
            jogador.restaurar();
        }

        System.out.println("\nRESULTADO FINAL");
        for (int i = 0; i < total; i++) {
            System.out.println(resultados[i]);
        }
        if (jogador.estaVivo()) {
            System.out.println("Parabéns, a Rebelião venceu!");
        } else {
            System.out.println("Fim de jogo.");
        }
    }
}