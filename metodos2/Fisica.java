public class Fisica extends Pessoa {
    //Atributos
    public String CPF;

    //Métodos
    public Fisica(String nome, String naturalidade, String nacionalidade, String CPF, String endereco){
        super(nome,naturalidade, nacionalidade, endereco);
        this.CPF = CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }
}