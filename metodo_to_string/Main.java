package metodo_to_string;
import java.util.GregorianCalendar;

public class Main {
    private static Pessoa grupo[];
    public static void main(String[] args) {
        grupo = new Pessoa[2];
        grupo [0] = new Fisica("Marco Antônio", new GregorianCalendar(2010, GregorianCalendar.OCTOBER, 23), "123.456.789-00", "Brasil", "Rio de Janeiro");
        grupo [1] = new Pessoa("Escola Novo Mundo Ltda", new GregorianCalendar(2000, GregorianCalendar.FEBRUARY, 29), "299.334.532/0026-23", "Brasil", "Rio de Janeiro");
        for (int i = 0; i <= 1; i++)
        System.out.println("grupo["+ i + "] = " + grupo[i].toString());
    }
}
