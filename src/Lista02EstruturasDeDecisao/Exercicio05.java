/*
Os ingressos de um cinema custam X reais.
Na terça-feira há um desconto de 50% e em qualquer dia menores de 14 anos também tem desconto de 50%.
Os descontos são cumulativos.

Faça um programa que leia do usuário o dia da semana, a idade do espectador e o preço base do ingresso e escreva o valor a pagar.
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em numero): ");
        int diaSemana = scanner.nextInt();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o preço base do ingresso: ");
        double precoBase = scanner.nextDouble();

        double desconto = 1.0;

        if (diaSemana == 3) {
            desconto = desconto - 0.5;
        }

        if (idade < 14) {
            desconto = desconto - 0.5;
        }

        double precoFinal = precoBase * desconto;

        System.out.println("Seu ingresso ira custar: R$ " + precoFinal);

        scanner.close();
    }
}
