//O guichê de pedágio de uma rodovia possui um equipamento que registra diariamente a quantidade de carros que passaram.
//Faça um programa para ler cada registro do mês de setembro e informar qual o maior volume de carros que passou e em qual dia do mês.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] volumeDiarioCarros = new int[30];
        int maiorVolume = Integer.MIN_VALUE;
        int dia = 0;

        for (int i = 0; i < volumeDiarioCarros.length; i++) {
            System.out.print("Digite o volume de carros no dia " + (i+1) + ": ");
            volumeDiarioCarros[i] = scanner.nextInt();

            if (volumeDiarioCarros[i] > maiorVolume) {
                maiorVolume = volumeDiarioCarros[i];
                dia = i + 1;
            }
        }

        System.out.println("O maior volume de carros em um dia foi de " + maiorVolume + " carros no dia " + dia + " de Setembro");

        scanner.close();
    }
}
