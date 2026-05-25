package Lista08HerancaPolimorfismo.Exercicio01;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
    }

    public void aplicarJuros() {
        setSaldo(getSaldo() * 1.005);
        System.out.println("Juros aplicados com sucesso!");
    }
}
