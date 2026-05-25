//Faça um programa que leia o título de um filme e imprima-o como todas as letras em caixa alta.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o titulo do filme: ");
        String titulo = scanner.nextLine();

        System.out.println("Título: " + titulo.toUpperCase());

        scanner.close();
    }
}
