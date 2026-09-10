//Packages
package GereEscola;

//Classes
public class Pessoa{
    //Atributos
    protected String nome, nacionalidade, naturalidade;

    // Métodos
    public Pessoa(String nome, String nacionalidade, String naturalidade)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
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