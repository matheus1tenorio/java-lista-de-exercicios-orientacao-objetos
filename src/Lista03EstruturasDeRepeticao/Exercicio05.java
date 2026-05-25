//Faça um programa que leia 100 números e informe a média dos números.

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeroAtual;
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeroAtual = scanner.nextDouble();
            soma = soma + numeroAtual;
        }

        double media = soma / 10;
        System.out.println("A media dos numeros foi: " + media);
        scanner.close();
    }
}
