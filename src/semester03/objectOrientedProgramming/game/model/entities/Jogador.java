package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Random;
import java.util.Scanner;

public class Jogador extends Criatura {
    Scanner scanner = new Scanner(System.in);

    int ataquePerto = 50;
    int ataqueLonge = 150;

    public Jogador(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faca - dano: " + this.ataquePerto);
        System.out.println("2) Arco e Flecha - dano: " + this.ataqueLonge + " - chance: 50%");
        int escolha = scanner.nextInt();
        while (escolha < 1 || escolha > 2) {
            System.out.print("Número inválido. Digite novamente: ");
            escolha = scanner.nextInt();
        }
        if (escolha == 1) {
            criatura.tomaDano(this.ataquePerto);
        } else if (escolha == 2) {
            Random rd = new Random();
            int sorteio = rd.nextInt(100);
            if (sorteio < 50) {
                criatura.tomaDano(this.ataqueLonge);
            } else {
                System.out.println("Errou!");
            }
        }

    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Não contavam com minha astúcia!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("pipipipipipipipi");

    }
}
