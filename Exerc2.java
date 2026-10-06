class Funcionario {
    protected String nome;
    protected double salarioBaseExerc6;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBaseExerc6 = salarioBase;
    }

    double salario() { return salarioBaseExerc6; }
}

class Gerente extends Funcionario {
    private double bonus;

    Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    double salario() { return salarioBaseExerc6 + bonus; }
}

public class Exerc2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bruno", 3000, 2000);
        System.out.println(gerente.nome + ": " + gerente.salario());
    }
}