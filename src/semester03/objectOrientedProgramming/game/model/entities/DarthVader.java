package semester03.objectOrientedProgramming.game.model.entities;

public class DarthVader extends Inimigo {

    public DarthVader() {
        super("Darth Vader", 1000, 100, new DefesaMista(10, 10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Você não conhece o poder do Lado Sombrio.");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Sinto... a luz em você...");
    }
}
