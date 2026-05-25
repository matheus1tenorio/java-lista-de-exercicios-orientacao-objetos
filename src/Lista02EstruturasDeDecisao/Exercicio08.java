/*
Faça um programa que peça o tamanho dos três lados de um triângulo.
O programa deverá informar se os lados informados podem formar um triângulo.
Caso os lados formem um triângulo o programa deve escrever se o mesmo é: equilátero, isósceles ou escaleno.
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o tamanho do lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o tamanho do lado 3: ");
        int lado3 = scanner.nextInt();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os lados podem formar um triangulo");

            if ((lado1 == lado2) && lado1 == lado3) {
                System.out.println("O triangulo é: Equilátero");
            } else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))  {
                System.out.println("O triangulo é: Escaleno");
            } else {
                System.out.println("O triangulo é: Isósceles");
            }

        } else {
            System.out.println("Os lados nao podem formar um triangulo");
        }

        scanner.close();
    }
}
