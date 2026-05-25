/*
Faça um algoritmo que leia o número de um canal de televisão e escreva o nome da emissora
correspondente.
Caso o usuário forneça um canal sem emissora exibir a mensagem “Canal inválido”.

Considere as seguintes emissoras e seus respectivos canais:
1 = SBT
2 = BAND
3 = Record
4 = Globo
5 = RedeTV!
 */

package Lista02EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do canal: ");
        int canal = scanner.nextInt();

        switch (canal) {
            case 1:
                System.out.println("Voce selecionou o canal: SBT");
                break;
            case 2:
                System.out.println("Voce selecionou o canal: BAND");
                break;
            case 3:
                System.out.println("Voce selecionou o canal: RECORD");
                break;
            case 4:
                System.out.println("Voce selecionou o canal: GLOBO");
                break;
            case 5:
                System.out.println("Voce selecionou o canal: REDE TV");
                break;
            default:
                System.out.println("Canal invalido!");
        }

        scanner.close();
    }
}
