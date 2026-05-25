// Faça um programa que peça dois números e imprima o maior deles.

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior numero é " + numero2);
        } else {
            System.out.println("Os numeros sao iguais");
        }

        scanner.close();
    }
}
