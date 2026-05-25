//Faça um programa que leia uma quantidade indefinida de números positivos e imprima cada um deles. Números negativos indicam o fim das leituras.

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite quantos numeros positivos quiser. Digitar um numero negativo indica o fim da execução");

        while (true) {
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println(" ");
                break;
            }

            System.out.println("Numero digitado: " + numero);
            System.out.println(" ");
        }

        System.out.println("Fim da execução");
        scanner.close();
    }
}
