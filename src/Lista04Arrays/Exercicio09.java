//Uma loja trabalha com 10 modelos de sapato. Faça um programa que leia o preço dos 10 modelos e depois
// imprima o preço de cada modelo no valor de à vista (5% de desconto) e no cartão (5% de acréscimo)

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precoSapato = new double[10];

        for (int i = 0; i < precoSapato.length; i++) {
            System.out.print("Digite o preço do sapato " + (i+1) + ": ");
            precoSapato[i] = scanner.nextDouble();
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");

        for (int i = 0; i < precoSapato.length; i++) {
            System.out.println("Preço do sapato " + (i+1) + " à vista: " + (precoSapato[i] * 0.95));
            System.out.println("Preço do sapato " + (i+1) + " no cartão: " + (precoSapato[i] * 1.05));
            System.out.println(" ");
        }

        scanner.close();
    }
}
