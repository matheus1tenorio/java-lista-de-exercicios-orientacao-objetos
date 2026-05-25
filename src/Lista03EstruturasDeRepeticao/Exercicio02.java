//Faça um programa que peça uma nota, entre zero e dez.
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Digite uma nota valida!");
            } else {
                break;
            }
        }

        scanner.close();
    }
}
