package GereEscola;

public class Principal {
    public static void main(String[] args) {
        Derivada der = new Derivada("João", "123", "Brasileiro(a)", "São Paulo");
        System.out.println(der.getNome() + ", " + der.getId());
        System.out.println(der.getNacionalidade() + ", " + der.getNaturalidade());
    }
}