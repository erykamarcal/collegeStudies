package semester03.objectOrientedProgramming.game.model.application;

import semester03.objectOrientedProgramming.game.model.entities.Criatura;
import semester03.objectOrientedProgramming.game.model.entities.Inimigo;
import semester03.objectOrientedProgramming.game.model.entities.Jogador;

public class Program {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Karolyna");
        Inimigo inimigo = new Inimigo("Demogorgon", 1000);

        System.out.println("COMEÇA A BATALHA");
        System.out.println("================================");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        while (true){
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()){
                inimigo.fazAtaque(jogador);
            }
        }
        if (!jogador.estaVivo()){
            jogador.fraseMorte();
            System.out.println(inimigo.getNome() + " venceu!");
        }

        if (!inimigo.estaVivo()){
            jogador.fraseMorte();
            System.out.println(jogador.getNome() + " venceu!");
        }
    }
}
