package semester03.objectOrientedProgramming.game.model.entities;

public class Jogador extends Criatura{

    int ataquePerto = 50;
    int ataqueLonge = 150;

    public Jogador(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Não contavam com minha astúcia");
    }

    @Override
    public void fraseMorte() {
        System.out.println("AAAAAAA");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faca - dano: " + this.ataquePerto);
        System.out.println("2) Arco e Flecha - dano: " + this.ataqueLonge + " - chance: 50%");
    }

    @Override
    public void mostraVida() {

    }
}
