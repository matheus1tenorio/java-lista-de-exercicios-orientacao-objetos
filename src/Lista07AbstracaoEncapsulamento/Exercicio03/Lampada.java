package Lista07AbstracaoEncapsulamento.Exercicio03;

public class Lampada {
    private boolean ligada;

    public Lampada() {
        ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligarLampada() {
        ligada = true;
    }

    public void desligarLampada() {
        ligada = false;
    }
}
