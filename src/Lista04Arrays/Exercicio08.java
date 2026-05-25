//Faça um programa para ler o preço de um produto em cada um dos meses do ano e depois imprimir a média do valor do produto no ano. Utilize o conceito de arrays.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precoMensal = new double[12];
        double soma = 0;

        for (int i = 0; i < precoMensal.length; i++) {
            System.out.print("Digite o valor do produto no mes " + (i+1) + ": ");
            precoMensal[i] = scanner.nextDouble();
            soma = soma + precoMensal[i];
        }

        System.out.println("A média do preço do produto no ano foi: " + (soma / 12));
        scanner.close();
    }
}
