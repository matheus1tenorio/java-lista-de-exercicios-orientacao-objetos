// Faça um programa que leia do usuário a temperatura em graus Fahrenheit e converta a temperatura para graus Celsius. Utilize a seguinte fórmula: C = (5 * (F-32) / 9).

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = 5 * (temperaturaFahrenheit - 32) / 9;

        System.out.println("A temperatura digitada em Celsius é: " + temperaturaCelsius);

        scanner.close();
    }
}
