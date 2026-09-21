package metodos2;

public class Pessoa {
    //Atributos
    public String nome,  naturalidade, nacionalidade, endereco;
    //Métodos
    public Pessoa (String nome, String naturalidade, String nacionalidade, String endereco){
        this.nome = nome;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }
    public String getNaturalidade(){
        return naturalidade;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
}