package semester03.objectOrientedProgramming.game.model.entities;


public abstract class ArmaLongaDistancia extends Arma {
    private int municaoInicial;
    private int municao;

    public ArmaLongaDistancia(String nome, int ataque, int chance, int municao) {
        super(nome, ataque, chance);
        this.municaoInicial = municao;
        this.municao = municao;
    }

    @Override
    public void mensagem() {
        super.mensagem();
        System.out.println("Munição restante: " + this.municao);
    }

    @Override
    public boolean temMunicao() {
        return this.municao > 0;
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        if (!this.temMunicao()) {
            System.out.println("Sem munição!");
            return;
        }
        this.municao--;
        super.fazAtaque(criatura);
    }

    @Override
    public void recarregar() {
        this.municao = this.municaoInicial;
    }

    @Override
    public void melhorar() {
        this.municaoInicial += 4;
        this.municao = this.municaoInicial;
    }
}
