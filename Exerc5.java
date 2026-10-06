class Conta {
    protected double saldo;
    void depositar(double valor) { if (valor > 0) saldo += valor; }
    double getSaldo() { return saldo; }
}

class ContaPoupanca extends Conta {
    void renderJuros(double taxa) { saldo += saldo * taxa; }
}

public class Exerc5 {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(1000);
        poupanca.renderJuros(0.10);
        System.out.println("Saldo: " + poupanca.getSaldo());
    }
}
