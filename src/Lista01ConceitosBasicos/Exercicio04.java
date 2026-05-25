//Faça um programa que leia do usuário as 4 notas de um aluno e calcule a média.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A sua media foi: " + media);

        scanner.close();
    }
}
