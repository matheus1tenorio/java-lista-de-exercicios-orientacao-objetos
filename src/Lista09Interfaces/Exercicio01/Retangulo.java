package Lista09Interfaces.Exercicio01;

public class Retangulo implements AreaCalculavel {
    private double tamanhoBase;
    private double tamanhoAltura;

    public Retangulo(double tamanhoBase, double tamanhoAltura) {
        this.tamanhoBase = tamanhoBase;
        this.tamanhoAltura = tamanhoAltura;
    }

    public double getTamanhoBase() {
        return tamanhoBase;
    }

    public void setTamanhoBase(double tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }

    public double getTamanhoAltura() {
        return tamanhoAltura;
    }

    public void setTamanhoAltura(double tamanhoAltura) {
        this.tamanhoAltura = tamanhoAltura;
    }

    @Override
    public double calcularArea() {
        return tamanhoBase * tamanhoAltura;
    }
}
