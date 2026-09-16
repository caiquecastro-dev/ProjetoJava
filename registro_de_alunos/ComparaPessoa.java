package registro_de_alunos;

import java.util.Comparator;

public class ComparaPessoa implements Comparator<PessoaFisica> {
    @Override
    public int compare(PessoaFisica obj1, PessoaFisica obj2) {
            return obj1.getNome().compareToIgnoreCase (obj2.getNome()); //Retorna zero se os nomes são iguais Desconsidera a caixa
    }  
}