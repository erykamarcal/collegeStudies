package semester03.objectOrientedProgramming.game.model.entities;

public class Demonion extends Inimigo {

    public Demonion() {
        super("Demonion", 500, 200);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou o terrível!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu vou me vingar!");
    }
}

