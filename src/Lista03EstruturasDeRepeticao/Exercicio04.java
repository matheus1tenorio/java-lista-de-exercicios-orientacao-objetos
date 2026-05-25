//Faça um programa que leia 50 números e informe o maior número.

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorNumero = Double.MIN_VALUE;
        double numeroAtual;

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite um numero: ");
            numeroAtual = scanner.nextDouble();

            if (numeroAtual > maiorNumero) {
                maiorNumero = numeroAtual;
            }
        }

        System.out.println(" ");
        System.out.println("O maior numero digitado foi: " + maiorNumero);
        scanner.close();
    }
}
