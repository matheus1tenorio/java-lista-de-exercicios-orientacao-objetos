//Faça um programa que leia de uma única vez o nome e o sobrenome de uma pessoa e imprima somente o sobrenome.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome e sobrenome: ");
        String nomeCompleto = scanner.nextLine().trim();

        String[] partesNomeCompleto = nomeCompleto.split(" ");
        String sobrenome = partesNomeCompleto[partesNomeCompleto.length - 1];

        System.out.println("Sobrenome: " + sobrenome);

        scanner.close();
    }
}
