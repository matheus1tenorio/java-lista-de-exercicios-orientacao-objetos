package Lista07AbstracaoEncapsulamento.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(10, 600);

        System.out.println("Altitude atual: " + aviao.getAltitude() + " Km");
        System.out.println("Velocidade atual: " + aviao.getVelocidade() + " Km/h");
        System.out.println(" ");

        aviao.reduzirAltitude(1);
        aviao.reduzirVelocidade(100);

        System.out.println("Altitude atual: " + aviao.getAltitude() + " Km");
        System.out.println("Velocidade atual: " + aviao.getVelocidade() + " Km/h");
        System.out.println(" ");

        aviao.reduzirAltitude(5);
        aviao.reduzirVelocidade(200);

        System.out.println("Altitude atual: " + aviao.getAltitude() + " Km");
        System.out.println("Velocidade atual: " + aviao.getVelocidade() + " Km/h");
        System.out.println(" ");

        aviao.reduzirAltitude(11);
        aviao.reduzirVelocidade(500);

        System.out.println("Altitude atual: " + aviao.getAltitude() + " Km");
        System.out.println("Velocidade atual: " + aviao.getVelocidade() + " Km/h");
        System.out.println(" ");
    }
}
