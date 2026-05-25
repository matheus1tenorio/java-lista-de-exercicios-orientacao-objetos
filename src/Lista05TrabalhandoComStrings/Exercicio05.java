//Leia o nome completo do usuário e imprima o número de caracteres dele.

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Seu nome completo tem " + nomeCompleto.trim().length() + " caracteres");

        scanner.close();
    }
}
