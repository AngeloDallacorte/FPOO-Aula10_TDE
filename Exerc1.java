class Animal {
    String som() { return "..."; }
}

class Cachorro extends Animal {
    @Override String som() { return "Au au"; }
}

class Gato extends Animal {
    @Override String som() { return "Miau"; }
}

public class Exerc1 {
    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato() };
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }
}