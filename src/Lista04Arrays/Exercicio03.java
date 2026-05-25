//Faça um programa em Java que gere um array de 20 posições, onde cada elemento do array corresponde ao quadrado da sua posição. Imprima o array resultante.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero a ser guardado na posição " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Imprimindo os numeros apenas nas posições impares: ");

        for (int i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0) {
                continue;
            }

            System.out.println("Numero na posição " + (i+1) + ": " + array[i]);
        }

        scanner.close();
    }
}
