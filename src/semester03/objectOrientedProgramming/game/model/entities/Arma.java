package semester03.objectOrientedProgramming.game.model.entities;

import java.util.Random;

public abstract class Arma {
    private String nome;
    private int ataque;
    private int chance;

    public Arma(String nome, int ataque, int chance) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
    }

    public Arma(String nome, int ataque) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = 100;
    }

    public void mensagem (){
        System.out.println(this.nome + " - dano: " + this.ataque + " - chance: " + chance + "%");
    }
    public void fazAtaque (Criatura criatura){
        Random random = new Random();
        int sorteio = random.nextInt(100);
        if (sorteio < 50) {
            criatura.tomaDano(this.ataque);
        } else {
            System.out.println("Errou!");
        }
    }
}

