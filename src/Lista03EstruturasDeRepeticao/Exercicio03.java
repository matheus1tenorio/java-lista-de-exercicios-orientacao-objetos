/*
Uma academia deseja fazer um censo entre seus clientes para descobrir o mais alto, o mais baixo, a mais
gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso.
O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.
Ao encerrar o programa também deve ser informados os valores do cliente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes.
 */

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidadeClientes = 0;
        double altura;
        double peso;

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE;

        double somaAlturas = 0;
        double somaPesos = 0;
        double mediaAlturas;
        double mediaPesos;

        while (true) {
            System.out.print("Digite seu codigo: ");
            codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            } else {
                quantidadeClientes += 1;
            }

            System.out.print("Digite sua altura: ");
            altura = scanner.nextDouble();
            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            System.out.print("Digite seu peso: ");
            peso = scanner.nextDouble();
            somaPesos += peso;

            if (peso > maiorPeso) {
                maiorPeso = peso;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
            }

            System.out.println("---------------");
        }

        System.out.println(" ");

        mediaAlturas = somaAlturas / quantidadeClientes;
        mediaPesos = somaPesos / quantidadeClientes;

        System.out.println("A MAIOR altura foi: " + maiorAltura + " cm");
        System.out.println("A MENOR altura foi: " + menorAltura + " cm");
        System.out.println("O MAIOR peso foi: " + maiorPeso + " kg");
        System.out.println("O MENOR peso foi: " + menorPeso + " kg");
        System.out.println("A MEDIA das alturas foi: " + mediaAlturas + " cm");
        System.out.println("A MEDIA dos pesos foi: " + mediaPesos + " kg");

        scanner.close();
    }
}
