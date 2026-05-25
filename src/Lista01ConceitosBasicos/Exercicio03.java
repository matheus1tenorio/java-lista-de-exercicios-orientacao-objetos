//Faça um programa que leia do usuário dois números e calcule a soma.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("O resultado da adicao dos numeros foi: " + soma);

        scanner.close();
    }
}
