// Faça um programa que leia do usuário um valor em metros e converta para centímetros.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em metros: ");
        double quantidadeMetros = scanner.nextDouble();

        double quantidadeCentimetros = quantidadeMetros * 100;

        System.out.println(quantidadeMetros + " metros em centimetros é igual a: " + quantidadeCentimetros + " cm");

        scanner.close();
    }
}
