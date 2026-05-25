/*
Faça um programa que leia a senha de um usuário e imprima a mensagem “Acesso Liberado” caso a senha digitada seja “eu amo programar” ou a mensagem “Senha Incorreta”  caso contrário.
Se o usuário digitar espaços em branco antes e depois da senha, os mesmos devem ser desconsiderados, ou seja, a senha “     eu amo programar     ” deve ser considerada válida apesar dos espaços em branco antes e depois.
 */

package Lista05TrabalhandoComStrings;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();
        senha = senha.trim();

        if (senha.equals("eu amo programar")) {
            System.out.println("Acesso Liberado!");
        } else {
            System.out.println("Senha Incorreta!");
        }

        scanner.close();
    }
}
