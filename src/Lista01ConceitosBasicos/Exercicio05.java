// Faça um programa que leia do usuário o número de cavalos de um haras e calcule quantas ferraduras devem ser compradas.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos cavalos existem no haras: ");
        int numCavalos = scanner.nextInt();

        System.out.println("Voce precisa comprar " + (numCavalos * 4) + " ferraduras");

        scanner.close();
    }
}
