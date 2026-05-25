//Tendo como dados de entrada a altura de uma pessoa, construa um programa que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = 72.7 * altura - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        scanner.close();
    }
}
