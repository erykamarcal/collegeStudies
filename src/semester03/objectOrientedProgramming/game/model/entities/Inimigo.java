package semester03.objectOrientedProgramming.game.model.entities;

public abstract class Inimigo extends Criatura{

    private int ataque;

    public Inimigo(String nome, int ataque) {
        super(nome, 100);
        this.ataque = ataque;
    }

    @Override
    public void fazAtaque(Criatura criatura){
        criatura.tomaDano(this.ataque);
    }
}
