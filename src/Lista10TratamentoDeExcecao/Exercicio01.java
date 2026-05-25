package Lista10TratamentoDeExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite um numero inteiro para ver qual letra do seu nome corresponde a esse indice: ");
        int indice = scanner.nextInt();

       try {
           System.out.println("Indice " + indice + " no nome " + nome + ": " + nome.charAt(indice));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("Posição inválida");
       }

       scanner.close();
    }
}