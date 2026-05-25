package Lista09Interfaces.Exercicio03;

public class Ventilador implements Controlavel {

    @Override
    public void ligar() {
        System.out.println("Ligando Ventilador...");
        System.out.println("Ventilador ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Ventilador...");
        System.out.println("Ventilador Desligado!");
    }
}
