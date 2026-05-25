package Lista09Interfaces.Exercicio03;

public class Videogame implements Controlavel {

    @Override
    public void ligar() {
        System.out.println("Ligando Videogame...");
        System.out.println("Videogame ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Videogame...");
        System.out.println("Videogame Desligado!");
    }
}
