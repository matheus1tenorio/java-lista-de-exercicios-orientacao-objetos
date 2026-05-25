/*
Faça um algoritmo que calcule e exiba a nota de um aluno em uma prova de 10 questões. Para calcular a nota do aluno deve-se ler do usuário a resposta de cada uma das 10 questões e comparar com o gabarito abaixo:

01 - A
02 - B
03 - C
 04 - D
05 - E
06 - E
07 - D
08 - C
09 - B
10 - A
 */

package Lista03EstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
        int acertos = 0;
        String resposta;

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Digite a resposta da questao " + (i+1) + ": ");
            resposta = scanner.next();

            if (resposta.equalsIgnoreCase(gabarito[i])) {
                acertos++;
            }
        }

        System.out.println("Sua nota foi: " + acertos);
        scanner.close();
    }
}
