package Lista09Interfaces.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Ventilador venti = new Ventilador();
        Videogame game = new Videogame();

        tv.ligar();
        tv.desligar();

        System.out.println(" ");

        venti.ligar();
        venti.desligar();

        System.out.println(" ");

        game.ligar();
        game.desligar();
    }
}
