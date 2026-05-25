/*
Faça um programa que faça cinco perguntas para uma pessoa sobre um crime.
No final o programa deve emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

As perguntas são:
Telefonou para a vítima?
Esteve no local do crime?
Mora perto da vítima?
Devia para a vítima?
Já trabalhou com a vítima?
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respostasPositivas = 0;
        int resposta;

        System.out.println("Responda 1 para 'SIM' ou 2 para 'NÃO'");

        System.out.print("Telefonou para a vítima? ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            respostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            respostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            respostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            respostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            respostasPositivas++;
        }

        if (respostasPositivas == 2) {
            System.out.println("A pessoa é: SUSPEITA!");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("A pessoa é: CUMPLICE!");
        } else if (respostasPositivas == 5) {
            System.out.println("A pessoa é: ASSASINO!");
        } else {
            System.out.println("A pessoa é: INOCENTE!");
        }

        scanner.close();
    }
}
