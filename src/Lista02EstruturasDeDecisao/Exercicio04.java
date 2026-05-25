/*
A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês.
Faça um programa que leia o saldo inicial, o total de débitos e o total de créditos e depois escreva o saldo final do cliente através de uma dessas três mensagens:

“Saldo positivo em R$ X”,  “Saldo negativo em R$ X” ou “Saldo Zero”.
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o total de debitos: ");
        double debitos = scanner.nextDouble();

        System.out.print("Digite o total de creditos: ");
        double creditos = scanner.nextDouble();

        double saldoFinal = saldoInicial + debitos - creditos;

        if (saldoFinal > 0) {
            System.out.println("Saldo positivo em: R$ " + saldoFinal);
        } else if (saldoFinal < 0) {
            System.out.println("Saldo negativo em: R$ " + saldoFinal);
        } else  {
            System.out.println("Saldo zero");
        }

        scanner.close();
    }
}
