package Lista09Interfaces.Exercicio01;

public class Quadrado implements AreaCalculavel {
    private double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    @Override
    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}
