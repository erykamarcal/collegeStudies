package semester03.objectOrientedProgramming.game.model.entities;

public class Batalha {
    private Jogador jogador;
    private Inimigo inimigo;
    private boolean venceu;

    public Batalha(Jogador jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public boolean lutar() {
        System.out.println("=== A batalha começou! ===");
        System.out.println(jogador.getNome() + " enfrenta " + inimigo.getNome());

        System.out.print(inimigo.getNome() + ": ");
        inimigo.fraseApresentacao();

        System.out.print(jogador.getNome() + ": ");
        jogador.fraseApresentacao();

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);

            if (inimigo.estaVivo()) {
                inimigo.upgrade();
                inimigo.fazAtaque(jogador);
            }
        }

        venceu = jogador.estaVivo();
        if (venceu) {
            System.out.print(inimigo.getNome() + ": ");
            inimigo.fraseMorte();
        } else {
            System.out.print(jogador.getNome() + ": ");
            jogador.fraseMorte();
        }
        return venceu;
    }

    public String getResultado() {
        if (venceu) {
            return "Vitória contra " + inimigo.getNome();
        }
        return "Derrota contra " + inimigo.getNome();
    }
}