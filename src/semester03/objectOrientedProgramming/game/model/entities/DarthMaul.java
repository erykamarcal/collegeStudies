package semester03.objectOrientedProgramming.game.model.entities;

public class DarthMaul extends Inimigo {

    public DarthMaul() {
        super("Darth Maul", 800, 60);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Finalmente vou me vingar dos Jedi!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Não... novamente não...");
    }

    private boolean upgraded = false;
    private int vidaCritica = 200;

    @Override
    public void upgrade() {
        if (!upgraded) {
            if (vidaCritica(vidaCritica)) {
                System.out.println(getNome() + " entrou em fúria!");
                upgraded = true;
                setDefesa(new Escudo(30));
                setAtaque(120);
            }
        }
    }
}

