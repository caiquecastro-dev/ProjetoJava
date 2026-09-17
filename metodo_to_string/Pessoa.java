package metodo_to_string;

//Importações
import java.util.Calendar;

public class Pessoa {
    //Atributos
    protected String nome, naturalidade, nacionalidade, identificador;
    private Calendar data_nascimento;
    private int idade;
    //Métodos
    public Pessoa(String nome, Calendar data_nascimento, String identificador, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.identificador = identificador;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public Calendar getDatanascimento() {
        return data_nascimento;
    }
//Usando o método "ToString"
@Override
public String toString() {
        return """
               Objeto:
               \t - Classe:""" + getClass().getName() + "\n\t - Hash: " + 
        Integer.toHexString(hashCode()) +  "\n\t - Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}