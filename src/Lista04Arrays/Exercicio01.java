//Faça um programa que leia um array de 5 números inteiros e mostre-os.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosInteiros = new int[5];

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print("Digite o numero inteiro a ser guardado na poisção " + (i+1) + ": ");
            numerosInteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.println("Numero na posição " + (i+1) + ": " + numerosInteiros[i]);
        }

        scanner.close();
    }
}
