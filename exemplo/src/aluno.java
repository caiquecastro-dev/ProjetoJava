package exemplo.src;

public class aluno extends PessoaFisica {
    String matricula;
    
    public aluno(String nome, String CPF, String matricula){
        super(nome, CPF);
        this.matricula = matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aluno outroAluno)) {
            return false;
        }
        return java.util.Objects.equals(this.CPF, outroAluno.CPF)
                && java.util.Objects.equals(this.matricula, outroAluno.matricula);
    }
    @Override
    public int hashCode(){
        return(this.CPF + this.matricula).hashCode();
    }
    @Override
    public String toString(){
        return String.format("Classe: <%s> | Hash: %s" , "Aluno", Integer.toHexString(hashCode()).toUpperCase());
    }
}
