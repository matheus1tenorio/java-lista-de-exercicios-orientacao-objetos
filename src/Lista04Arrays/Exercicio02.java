//Faça um programa um array de 10 números reais e mostre-os na ordem inversa.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numerosReais = new  double[10];

        for (int i = 0; i < numerosReais.length; i++) {
            System.out.print("Digite o numero real a ser guardado na poisção " + (i+1) + ": ");
            numerosReais[i] = scanner.nextInt();
        }

        for (int i = numerosReais.length -1; i >= 0; i--) {
            System.out.println("Numero na posição " + (i+1) + " :" + numerosReais[i]);
        }

        scanner.close();
    }
}
