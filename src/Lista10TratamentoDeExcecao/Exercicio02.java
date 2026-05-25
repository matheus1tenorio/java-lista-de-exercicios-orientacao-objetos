package Lista10TratamentoDeExcecao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um numero para ser o dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite um numero para ser o divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;

            System.out.println("Resultado da divisão de " + dividendo + " / " + divisor + " = " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero");
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida");
        }

        scanner.close();
    }
}
