package Lista08HerancaPolimorfismo.Exercicio01;

public abstract class Conta {
    private int numeroDaConta;
    private double saldo;

    public Conta(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Depositado R$ " + deposito + " com sucesso na conta de número " + numeroDaConta);
    }

    public void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Voce sacou R$ " + saque + " com sucesso na conta de numero " + numeroDaConta);
        } else {
            System.out.println("Voce nao possui saldo suficiente!");
        }
    }
}
