package GereEscola;

class Derivada extends Pessoa {
    public Derivada(String nome, String id, String nacionalidade, String naturalidade) {
        super(nome, nacionalidade, naturalidade);
        atualizarID(id);
    }

    public void setNome(String nome) {
        AtualizarNome(nome);
    }

    public String getNome() {
        return RecuperarNome();
    }

    public void setId(String id) {
        atualizarID(id);
    }

    public String getId() {
        return recuperarID();
    }

    public void setNacionalidade(String nacionalidade) {
        AtualizarNacionalidade(nacionalidade);
    }

    public String getNacionalidade() {
        return RecuperarNacionalidade();
    }

    public void setNaturalidade(String naturalidade) {
        AtualizarNaturalidade(naturalidade);
    }

    public String getNaturalidade() {
        return RecuperarNaturalidade();
    }
}