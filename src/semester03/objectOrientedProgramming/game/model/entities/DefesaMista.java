package semester03.objectOrientedProgramming.game.model.entities;

public class DefesaMista extends Defesa {

    private Escudo escudo;
    private Esquiva esquiva;

    public DefesaMista(int reducao, int chanceEsquiva) {
        this.escudo = new Escudo(reducao);
        this.esquiva = new Esquiva(chanceEsquiva);
    }

    @Override
    public int danoReduzido(int dano) {
        int aposEsquiva = esquiva.danoReduzido(dano);
        return escudo.danoReduzido(aposEsquiva);
    }
}

