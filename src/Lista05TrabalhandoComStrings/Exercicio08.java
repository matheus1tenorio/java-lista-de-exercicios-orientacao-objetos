//Faça um programa que leia o nome de dois alunos e imprima-os em ordem alfabética.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno 1: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o nome do aluno 2: ");
        String nome2 = scanner.nextLine();

        System.out.println("Ordem alfabética: ");

        if (nome1.compareToIgnoreCase(nome2) <= 0) {
            System.out.println(nome1);
            System.out.println(nome2);
        } else {
            System.out.println(nome2);
            System.out.println(nome1);
        }

        scanner.close();
    }
}
