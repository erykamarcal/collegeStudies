package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Random;

public class Esquiva extends Defesa{
    private int chance;

    public Esquiva(int chance) {
        if (chance < 0) chance = 0;
        if (chance > 100) chance = 100;
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int dano){

        Random random = new Random();
        int sorteio = random.nextInt(100);
        if (sorteio < this.chance){
            System.out.println("Esquivou!");
            return 0;
        }
        return dano;
    }
}
