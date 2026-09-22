package exemplo.src;

public class PessoaFisica {
    protected String CPF;
    protected String nome;

    public PessoaFisica (String nome, String CPF){
        this.nome = nome;
        if(validarCPF(CPF))
            this.CPF = CPF;
        else
            System.out.println("CPF inválido!");
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCPF(String CPF){
        if(validarCPF(CPF))
            this.CPF = CPF;
        else
            System.out.println("CPF inválido!");
    }
    public String getCPF(){
        return CPF;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        PessoaFisica outraPessoa = (PessoaFisica) obj;
        return java.util.Objects.equals(this.CPF, outraPessoa.CPF);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hashCode(CPF);
    }
    @Override 
    public String toString(){
        return String.format("Classe: <%s> | Hash: %s", "PessoaFisica" , Integer.toHexString(this.hashCode()).toUpperCase());
    }
    private boolean validarCPF(String CPF){
        //Verifica sequência de dígitos iguais e tamanho(11 digitos)
        if (!(CPF.chars().allMatch(Character::isDigit))) {
            System.out.println("CPF possui caracteres não númericos!");
            return false;
        }
        else if ((CPF.length()!= 11)|| CPF.matches ("[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}"))
            return false;
        return true;
    }
}
