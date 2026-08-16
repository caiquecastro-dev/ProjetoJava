package abstract_classes;

abstract class Animal {
    // metodo abstrato
    public abstract void emitirSom();

    // metodo concreto
    public void dormir() {
        System.out.println("Zzzz...");
    }

    public void tipoDeAnimal() {
        System.out.println("É um animal selvagem!");
    }
}

// subclasse concreta
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latir!");
    }
}

// subclasse concreta
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miar!");
    }
}

// subclasse concreta
class Leao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Rugir");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal leao = new Leao();

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();

        leao.emitirSom();
        leao.tipoDeAnimal();
        leao.dormir();
    }
}