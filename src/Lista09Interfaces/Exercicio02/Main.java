package Lista09Interfaces.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Soma som = new Soma(15, 17);
        Subtracao sub = new Subtracao(25, 12);
        Multiplicacao multi = new Multiplicacao(9, 12);
        Divisao div = new Divisao(120, 5);

        System.out.println("Resultado da soma: " + som.calcular());
        System.out.println("Resultado da subtração: " + sub.calcular());
        System.out.println("Resultado da multiplicação: " + multi.calcular());
        System.out.println("Resultado da Divisão: " + div.calcular());
    }
}
