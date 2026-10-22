package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Random;

public class Stormtrooper extends Inimigo {

    public Stormtrooper() {
        super("Stormtrooper", 400, 60, new Escudo(10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Pela Ordem do Império, pare aí mesmo!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Agh... errando até no último momento...");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        Random random = new Random();
        if (random.nextInt(100) < 35) {
            System.out.println(getNome() + " atirou e errou o alvo!");
        } else {
            super.fazAtaque(criatura);
        }
    }
}

