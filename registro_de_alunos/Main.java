package registro_de_alunos;

//Imports
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static SortedSet<Aluno> cj_ordenado;
    public static void main(String[] args) {
        System.out.println("Registro de Alunos - Ordenação por Nome: ");
        System.out.println("-=-".repeat(20));
        cj_ordenado = new TreeSet<>(new ComparaPessoa());
        cj_ordenado.add (new Aluno("Martins", "12345678912", "M1"));
        cj_ordenado.add (new Aluno("Martins", "12345678912", "M2"));
        cj_ordenado.add (new Aluno("Carla", "23456789012", "M3"));
        cj_ordenado.add (new Aluno("Ana", "23447899011", "M4"));
        System.out.println(cj_ordenado); 
        System.out.println("-=-".repeat(20));
    }
    
}
