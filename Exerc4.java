class Veiculo {
    protected String marca;
    Veiculo(String marca) { this.marca = marca; }
    String descricao() { return "Veiculo da marca " + marca; }
}

class Carro extends Veiculo {
    private int portas;
    Carro(String marca, int portas) {
        super(marca);
        this.portas = portas;
    }

    @Override
    String descricao() {
        return super.descricao() + " com " + portas + " portas";
    }
}

public class Exerc4 {
    public static void main(String[] args) {
        System.out.println(new Carro("Fiat", 4).descricao());
    }
}