//Faça um programa que leia um array de 10 posições de números reais e divida todos os seus elementos pelo maior valor do array. Imprima os valores do array após os cálculos.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorNumero = Double.MIN_VALUE;
        double[] numeros = new  double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero a ser guardado na posição " + (i+1) + ": ");
            numeros[i] = scanner.nextDouble();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            double divisao = numeros[i] / maiorNumero;

            System.out.println(numeros[i] + " / " + maiorNumero + " = " + divisao);
        }

        scanner.close();
    }
}
