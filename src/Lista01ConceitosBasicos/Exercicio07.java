// Faça um programa que calcule a área de um quadrado, em seguida escreva o dobro desta área.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto mede o lado do quadrado: ");
        int lado = scanner.nextInt();

        int area = lado * lado;
        int dobroArea = area * 2;

        System.out.println("A area do quadrado é igual a: " + area);
        System.out.println("O dobro da area é igual a: " + dobroArea);

        scanner.close();
    }
}
