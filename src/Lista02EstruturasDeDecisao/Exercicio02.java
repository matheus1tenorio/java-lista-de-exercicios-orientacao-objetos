// Faça um programa que leia três números e mostre o maior deles.

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite mais um outro numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior numero é " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior numero é " + numero3);
        } else {
            System.out.println("Os numeros sao iguais");
        }

        scanner.close();
    }
}
