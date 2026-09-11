package GereEscola;

class Derivada extends Pessoa {
    private final String nome;

    public Derivada (String nome, String id) {
        super(nome, null, null);
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

public class Principal {
    public static void main(String[] args) {
        Derivada Der = new Derivada("João", "123");
        System.out.println(Der.getNome());
    }
}