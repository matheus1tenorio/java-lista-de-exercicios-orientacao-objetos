package Lista08HerancaPolimorfismo.Exercicio02;

import Lista08HerancaPolimorfismo.Exercicio01.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta3 = new ContaPoupanca(123, 10000);
        ContaTesouroDireto conta4 = new ContaTesouroDireto(777, 10000);

        System.out.println("Saldo da conta de número " + conta3.getNumeroDaConta() + ": R$" + conta3.getSaldo());
        System.out.println("Saldo da conta de número " + conta4.getNumeroDaConta() + ": R$" + conta4.getSaldo());

        conta3.depositar(500);
        conta4.depositar(500);

        System.out.println("Saldo da conta de número " + conta3.getNumeroDaConta() + ": R$" + conta3.getSaldo());
        System.out.println("Saldo da conta de número " + conta4.getNumeroDaConta() + ": R$" + conta4.getSaldo());

        conta3.aplicarJuros();
        conta4.aplicarJuros();

        System.out.println("Saldo da conta de número " + conta3.getNumeroDaConta() + ": R$" + conta3.getSaldo());
        System.out.println("Saldo da conta de número " + conta4.getNumeroDaConta() + ": R$" + conta4.getSaldo());
    }
}
