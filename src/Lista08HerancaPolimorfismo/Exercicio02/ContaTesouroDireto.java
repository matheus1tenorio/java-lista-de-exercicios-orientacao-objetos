package Lista08HerancaPolimorfismo.Exercicio02;

import Lista08HerancaPolimorfismo.Exercicio01.ContaPoupanca;

public class ContaTesouroDireto extends ContaPoupanca {

    public ContaTesouroDireto(int numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
    }

    public void depositar(double deposito) {
        if (deposito >= 1000) {
            setSaldo(getSaldo() + deposito);
            System.out.println("Depositado R$ " + deposito + " com sucesso na conta de número " + getNumeroDaConta());
        } else {
            System.out.println("Só é permitido depósitos iguais ou acima de R$ 1000 em contas de Tesouro Direto");
        }
    }

    public void aplicarJuros() {
        setSaldo(getSaldo() * 1.01);
        System.out.println("Juros aplicados com sucesso!");
    }
}
