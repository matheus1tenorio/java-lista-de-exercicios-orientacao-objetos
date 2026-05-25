package Lista09Interfaces.Exercicio03;

public class Televisao implements Controlavel {

    @Override
    public void ligar() {
        System.out.println("Ligando Televisão...");
        System.out.println("Televisão ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Televisão...");
        System.out.println("Televisão Desligada!");
    }
}
