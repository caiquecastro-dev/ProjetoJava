package agrupamento_exemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Escola {
    //Atributos
    private final String nome;
    private final String CNPJ;

    private final List<Aluno> discentes;

    public static class Aluno {
        private final String nome;
        private final String naturalidade;

        public Aluno(String nome, String naturalidade) {
            this.nome = nome;
            this.naturalidade = naturalidade;
        }

        public String getNome() {
            return nome;
        }

        public String getNaturalidade() {
            return naturalidade;
        }

        public String recuperarNaturalidade() {
            return naturalidade;
        }
    }

    // Métodos
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.discentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno a : discentes) {
            String naturalidade = String.valueOf(a.recuperarNaturalidade());
            if (!agrupamento.containsKey(naturalidade)) {
                agrupamento.put(naturalidade, new ArrayList<>());
            }
            agrupamento.get(naturalidade).add(a);
        }
        System.out.println("Resultado do agrupamento por naturalidade: " +agrupamento);
    }
    
    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
        Escola escola = new Escola("Escola Pedro Álvares Cabral", "42.336.174/0006-13");

        aluno1 = new Aluno("Marco Antônio", "Rio de Janeiro");
        aluno2 = new Aluno("Clara Silva", "Rio de Janeiro");
        aluno3 = new Aluno("Marcos Cintra", "Sorocaba");
        aluno4 = new Aluno("Ana Beatriz", "Barra do Pirai");
        aluno5 = new Aluno("Marcio Gomes", "São Paulo");
        aluno6 = new Aluno("João Carlos", "Sorocaba");
        aluno7 = new Aluno("César Augusto", "São Paulo");
        aluno8 = new Aluno("Alejandra Gomez", "Madri");
        aluno9 = new Aluno("Castelo Branco", "São Paulo");

        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);

        escola.agruparAlunos();
    }
}