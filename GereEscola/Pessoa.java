//Packages
package GereEscola;

//Classes
class Pessoa{
    //Atributos
    protected String nome, nacionalidade, naturalidade;
    protected String identificador;
    // Métodos
    public Pessoa(String nome, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    protected void atualizarID(String identificador) {
        this.identificador = identificador;
    }
    protected String recuperarID() {
        return this.identificador;
    }
    protected void AtualizarNome(String nome){ 
        this.nome = nome;
    }
    protected String RecuperarNome(){
        return this.nome;
    }
    protected String RecuperarNacionalidade(){
        return this.nacionalidade;
    }
    protected String RecuperarNaturalidade(){
        return this.naturalidade;
    }
}