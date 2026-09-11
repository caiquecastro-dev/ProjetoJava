//Packages
package GereEscola;

//Importações
import java.util.UUID;

//Classes
public class Aluno extends Pessoa {
    //Atributos
    private final String matricula;

    //Métodos
    public Aluno (String nome, String nacionalidade, String naturalidade) {
        super(nome, nacionalidade, naturalidade, null);
        matricula = UUID.randomUUID().toString();
    }

    public String getMatricula() {
        return matricula;
    }
}