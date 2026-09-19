package semester03.objectOrientedProgramming.game.model.entities;

public abstract class Criatura {

    private String nome;
    private int vida;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void fraseApresentacao();
    public abstract void fraseMorte();
    public abstract void fazAtaque(Criatura criatura);
    public abstract void mostraVida(){
        System.out.println(this.nome + ": " + this.vida + " HP");
    }

    public String getNome() {
        return nome;
    }

    public boolean estaVivo(){
        return this.vida > 0;
    }
}
