package semester03.objectOrientedProgramming.game.model.entities;

public class Malignus extends Inimigo {

    public Malignus() {
        super("Malignus", 800, 60);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te matarr!!!!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Nããããããããããão!");
    }

    //sistema de upgrade

    private boolean upgraded = false;
    private int vidaCritica = 200;

    @Override
    public void upgrade() {
        if (!upgraded) {
            if (vidaCritica(vidaCritica)) {
                System.out.println(getNome() + "Esta turbinado");
                upgraded = true;
                setDefesa(new Escudo(40));
                setAtaque(200);
            }
        }
    }
}

