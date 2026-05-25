package Lista08HerancaPolimorfismo.Exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1234, 1000);

        System.out.println("Saldo da conta de número " + conta1.getNumeroDaConta() + ": R$" + conta1.getSaldo());
        conta1.depositar(100);
        System.out.println("Saldo da conta de número " + conta1.getNumeroDaConta() + ": R$" + conta1.getSaldo());
        conta1.depositar(400);
        System.out.println("Saldo da conta de número " + conta1.getNumeroDaConta() + ": R$" + conta1.getSaldo());
        conta1.sacar(200);
        System.out.println("Saldo da conta de número " + conta1.getNumeroDaConta() + ": R$" + conta1.getSaldo());
        conta1.sacar(2500);
        System.out.println("Saldo da conta de número " + conta1.getNumeroDaConta() + ": R$" + conta1.getSaldo());

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(" ");

        ContaPoupanca conta2 = new ContaPoupanca(2077, 4000);

        System.out.println("Saldo da conta de número " + conta2.getNumeroDaConta() + ": R$" + conta2.getSaldo());
        conta2.depositar(1000);
        System.out.println("Saldo da conta de número " + conta2.getNumeroDaConta() + ": R$" + conta2.getSaldo());
        conta2.aplicarJuros();
        System.out.println("Saldo da conta de número " + conta2.getNumeroDaConta() + ": R$" + conta2.getSaldo());
        conta2.sacar(2500);
        System.out.println("Saldo da conta de número " + conta2.getNumeroDaConta() + ": R$" + conta2.getSaldo());
        conta2.aplicarJuros();
        System.out.println("Saldo da conta de número " + conta2.getNumeroDaConta() + ": R$" + conta2.getSaldo());
    }
}
