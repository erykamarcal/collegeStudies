package semester03.objectOrientedProgramming.game.model.entities;

public class Malignus extends Inimigo {

    public Malignus() {
        super("Malignus", 1000, 100);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te matarr!!!!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Nããããããããããão!");
    }
}

