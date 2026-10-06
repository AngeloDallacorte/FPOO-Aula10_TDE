import java.util.ArrayList;
import java.util.Scanner;

class FuncionarioExerc6 {
    private String nome;
    private double salarioBaseExerc6;

    FuncionarioExerc6(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBaseExerc6 = salarioBase;
    }

    public String getNome() { return nome; }
    double salario() { return salarioBaseExerc6; }
}

class GerenteExerc6 extends FuncionarioExerc6 {
    private double bonus;

    GerenteExerc6(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    double salario() { return super.salario() + bonus; }
}

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FuncionarioExerc6> folha = new ArrayList<>();

        System.out.print("Quantos funcionarios? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salario base: ");
            double base = sc.nextDouble();
            System.out.print("E gerente? (s/n): ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Bonus: ");
                double bonus = sc.nextDouble();
                folha.add(new GerenteExerc6(nome, base, bonus));
            } else {
                folha.add(new FuncionarioExerc6(nome, base));
            }
        }

        System.out.println("\n=== FOLHA ===");
        double total = 0;
        for (FuncionarioExerc6 funcionario : folha) {
            System.out.printf("%s: R$ %.2f%n", funcionario.getNome(), funcionario.salario());
            total += funcionario.salario();
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}