//Faça um programa que leia dois números inteiros e escreva os números inteiros que estão no intervalo compreendido entre eles.

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para começar: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite um numero para finalizar: ");
        int fim = scanner.nextInt();

        System.out.println("Intervalo entre " + inicio + " a " + fim);

        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " - ");
        }

        scanner.close();
    }
}
