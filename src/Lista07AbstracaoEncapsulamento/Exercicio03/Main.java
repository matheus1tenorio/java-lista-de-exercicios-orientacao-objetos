package Lista07AbstracaoEncapsulamento.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        if (lampada.isLigada() == true) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }

        lampada.ligarLampada();

        if (lampada.isLigada() == true) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }

        lampada.desligarLampada();

        if (lampada.isLigada() == true) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }

        lampada.desligarLampada();
        lampada.ligarLampada();
        lampada.ligarLampada();
        lampada.ligarLampada();

        if (lampada.isLigada() == true) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }
    }
}
