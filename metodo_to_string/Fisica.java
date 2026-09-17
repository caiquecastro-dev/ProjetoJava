package metodo_to_string;

//Importações
import java.util.Calendar;

public class Fisica extends Pessoa {
    //Atributos

    //Metodo
    public Fisica(String nome, Calendar data_nascimento, String CPF, String nacionalidade, String naturalidade) {
        super(nome, data_nascimento, CPF, nacionalidade, naturalidade);
        atualizarIdade();
    }
    private void atualizarIdade() {
    }
}
