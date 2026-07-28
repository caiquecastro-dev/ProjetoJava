public class Aluno extends Pessoa {
    private final String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

public void main(String[] agrs) {
    System.out.println("ALUNO 1");
    Aluno aluno = new Aluno("João", "123.456.789-00", "2789");
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("CPF: " + aluno.getCpf());
    System.out.println("Matrícula: " + aluno.getMatricula());

    System.out.println("ALUNO 2");
    Aluno aluno2 = new Aluno("Caique", "000.332.445-44", "22459");
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("CPF: " + aluno2.getCpf());
    System.out.println("Matrícula: " + aluno2.getMatricula());
}