//Faça um programa que gere um array de 20 posições, onde cada elemento do array corresponde ao quadrado da sua posição. Imprima o array resultante.

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quadradoPosicao = new  int[20];

        for (int i = 0; i < quadradoPosicao.length; i++) {
            int posicao = i +1;
            int quadrado = posicao * posicao;
            quadradoPosicao[i] = quadrado;
        }

        for (int i = 0; i < quadradoPosicao.length; i++) {
            System.out.println("Quadrado da posição " + (i+1) + ": " + quadradoPosicao[i]);
        }

        scanner.close();
    }
}
