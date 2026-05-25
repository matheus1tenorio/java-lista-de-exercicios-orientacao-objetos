/*
Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e reajuste-o segundo o seguinte critério:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários acima de R$ 1500,00 : aumento de 5%

Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double salarioInicial = scanner.nextDouble();
        double aumento;

        if (salarioInicial <= 280) {
            aumento = 0.20;
        } else if (salarioInicial > 280 && salarioInicial <= 700) {
            aumento = 0.15;
        } else if (salarioInicial > 700 && salarioInicial <= 1500) {
            aumento = 0.10;
        } else {
            aumento = 0.05;
        }

        double valorAumento = salarioInicial * aumento;
        double salarioFinal = salarioInicial + valorAumento;

        System.out.println("Antigo salario: R$ " + salarioInicial);
        System.out.println("Percentual de aumento: " + (aumento * 100) + "%");
        System.out.println("O valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salario: R$ " + salarioFinal);

        scanner.close();
    }
}
