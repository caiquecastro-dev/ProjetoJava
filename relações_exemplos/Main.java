package relações_exemplos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 20, 12345);
        aluno1.imprimirAluno();
        
        Departamento departamento1 = new Departamento("Departamento de Matemática", 5);
        departamento1.imprimirdepartamento();

        Escola escola1 = new Escola("Escola ABC", "12.345.67-0001.44");
        escola1.imprimirEscola();
    }
}

class Aluno {
    private final String nome;
    private final int idade;
    private final int matricula;

    Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    void imprimirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }
}
class Departamento {
    private final String nomeDepartamento;
    private final int nr_Departamentos;

    Departamento(String nomeDepartamento, int nr_Departamentos) {
        this.nomeDepartamento = nomeDepartamento;
        this.nr_Departamentos = nr_Departamentos;
    }
    void imprimirdepartamento() {
        System.out.println("Nome do Departamento: " + nomeDepartamento);
        System.out.println("Número de Departamentos: " + nr_Departamentos);
    }
}

class Escola {
    private final String nome;
    private final String CNPJ;

    Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }
    void imprimirEscola() {
        System.out.println("Nome da Escola: " + nome);
        System.out.println("CNPJ: " + CNPJ);
    }
}
