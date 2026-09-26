package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Scanner;

public class Jogador extends Criatura {
    Scanner scanner = new Scanner(System.in);
    Arma[] armas;

    public Jogador(String nome, Arma[]armas) {
        super(nome, 1000);
        this.armas = armas;
    }


    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Escolha sua arma: ");
        int n = 1;
        for(Arma arma : armas){
            System.out.println(n + ") ");
            arma.mensagem();
            n++;

        int escolha = scanner.nextInt();

        while (escolha < 1 || escolha > n - 1) {
            System.out.print("Número inválido. Digite novamente: ");
            escolha = scanner.nextInt();
        }
       armas[escolha - 1].fazAtaque(criatura);
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
