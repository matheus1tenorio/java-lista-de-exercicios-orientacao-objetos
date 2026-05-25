//Faça um programa que leia o primeiro nome de duas pessoas e imprima a mensagem “Possuem o mesmo nome” caso ambas as pessoas tenham o mesmo nome ou “Não possuem o mesmo nome” caso contrário.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o primeiro nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Possuem o mesmo nome");
        } else {
            System.out.println("Não possuem o mesmo nome");
        }

        scanner.close();
    }
}
