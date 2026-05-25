package Lista09Interfaces.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Retangulo r1 = new Retangulo(6, 8);
        Circulo c1 = new Circulo(3);

        System.out.println("Área do Quadrado:" + q1.calcularArea());
        System.out.println("Área do Retângulo: " + r1.calcularArea());
        System.out.println("Área do Círculo: " + c1.calcularArea());

        System.out.println(" ");
        System.out.println("----------------------------------------------");
        System.out.println(" ");

        Quadrado q2 = new Quadrado(8);
        Retangulo r2 = new Retangulo(12, 16);
        Circulo c2 = new Circulo(12);

        System.out.println("Área do novo Quadrado: " + q2.calcularArea());
        System.out.println("Área do novo Retângulo: " +r2.calcularArea());
        System.out.println("Área do novo Círculo: " + c2.calcularArea());
    }
}
