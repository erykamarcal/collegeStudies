package semester03.objectOrientedProgramming.game.model.application;

import semester03.objectOrientedProgramming.game.model.entities.Criatura;
import semester03.objectOrientedProgramming.game.model.entities.Demonion;
import semester03.objectOrientedProgramming.game.model.entities.Jogador;

public class Program {
    public static void main(String[] args) {

        Criatura jogador = new Jogador("Eryka");
        Criatura inimigo = new Demonion();

        System.out.println("Começa a Batalha");
        System.out.println("################\n");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        while (true) {
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu.");
                break;
            }
            if (!inimigo.estaVivo()) {
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu.");
                break;
            }
        }
    }
}
