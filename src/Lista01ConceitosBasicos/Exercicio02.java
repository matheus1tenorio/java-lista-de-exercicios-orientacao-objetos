//Faça um programa que leia do usuário um número e escreva a mensagem: O número informado foi <número>.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: 6");
        int numero = scanner.nextInt();

        System.out.println("O numero informado foi: " + numero);

        scanner.close();
    }
}
