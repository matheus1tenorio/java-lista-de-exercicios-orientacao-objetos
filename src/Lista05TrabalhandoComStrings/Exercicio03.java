//Faça um programa que leia um número, converta-o para string e imprima seu valor.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);

        System.out.println("Numero digitado: " + numeroString);

        scanner.close();
    }
}
