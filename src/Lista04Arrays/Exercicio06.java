//Faça um programa que peça ao usuário qual número ele quer ver sua tabuada e depois imprima a tabuada desse nuúmero. Ultilize os conceitos de array

package Lista04Arrays;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual numero você deseja ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Tabuada do " + numero + ": ");
        System.out.println(" ");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
