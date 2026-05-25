//Faça um programa que leia o nome de uma pessoa e imprima somente a primeira letra do nome.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        nome = nome.trim();

        System.out.println("Primeira letra do seu nome: " + nome.charAt(0));

        scanner.close();
    }
}
