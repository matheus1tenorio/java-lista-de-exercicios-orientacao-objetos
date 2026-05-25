//Faça um programa que leia do usuário quanto ele ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

package Lista01ConceitosBasicos;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto voce recebe por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Digite quantas horas voce trabalhou neste mes: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Seu salario neste mes é: R$ " + (horasTrabalhadas * salarioHora));

        scanner.close();
    }
}
