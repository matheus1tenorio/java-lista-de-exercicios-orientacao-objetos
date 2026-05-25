//Faça um programa que leia o título de um livro e imprima a mensagem “Título acima do permitido” caso o título tenha mais de 20 caracteres.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();

        if (titulo.length() > 20) {
            System.out.println("Título acima do permitido");
        }

        scanner.close();
    }
}
