class Forma {
    double area() { return 0; }
}

class Quadrado extends Forma {
    private double lado;
    Quadrado(double lado) { this.lado = lado; }
    @Override double area() { return lado * lado; }
}

class Circulo extends Forma {
    private double raio;
    Circulo(double raio) { this.raio = raio; }
    @Override double area() { return 3.14159 * raio * raio; }
}

public class Exerc3 {
    public static void main(String[] args) {
        System.out.printf("Quadrado: %.2f%n", new Quadrado(4).area());
        System.out.printf("Circulo:  %.2f%n", new Circulo(2).area());
    }
}
