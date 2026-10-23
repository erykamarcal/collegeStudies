package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Scanner;

public class Jogador extends Criatura {
    Scanner scanner = new Scanner(System.in);
    Arma[] armas;

    public Jogador(String nome, Arma[] armas) {
        super(nome, 1000);
        this.armas = armas;
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Escolha sua arma: ");
        int n = 1;
        for (Arma arma : armas) {
            System.out.println(n + ") ");
            arma.mensagem();
            n++;
        }

        int escolha = scanner.nextInt();

        while (escolha < 1 || escolha > n - 1 || !armas[escolha - 1].temMunicao()) {
            System.out.print("Opção inválida ou arma sem munição. Digite novamente: ");
            escolha = scanner.nextInt();
        }
        armas[escolha - 1].fazAtaque(criatura);
    }

    public void restaurar() {
        restaurarVida();
        for (Arma arma : armas) {
            arma.recarregar();
        }
    }

    @Override
    public void upgrade() {
        System.out.println("*** UPGRADE! +300 de vida máxima e +4 de munição nas armas de longa distância ***");
        aumentarVidaMaxima(300);
        restaurarVida();
        for (Arma arma : armas) {
            arma.melhorar();
        }
    }


    @Override
    public void fraseApresentacao() {
        System.out.println("Eu serei a resitência. Hoje a galaxia será livre!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Podem me derrubar, mas a rebelião jamais morrerá!!!...");

    }
}
