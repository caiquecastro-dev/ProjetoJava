package GereEscola;

class Derivada extends Pessoa {
    private final String nome;

    public Derivada (String nome, String id) {
        super(nome, id);
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}