import java.util.Calendar;

public class Main {
    //Atributos
    private static int I1, I2, I3;
    private static String S1, S2, S3;
    private static Fisica p1, p2;
    private static Pessoa p3;

    //Métodos
    public static void main(String args[]) {
        I1 = 1;
        I2 = 2;
        I3 = 1;
        S1 = "a";
        S2 = "b";
        S3 = "a";
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        p1 = new Fisica("Marco Antônio", "365.586.875-45", null, "Brasil", "Rio de Janeiro");
        p2 = new Fisica("Marco Antônio", "365.586.875-45", null, "Brasil", "Rio de Janeiro");
        p3 = new Pessoa("Classe Pessoa", null, null, null);
        comparaEquals(p1, p2, p3);
        comparaEquals(I1, I2, I3);
        comparaEquals(S1, S2, S3);
    }
    private static void comparaEquals(Object o1, Object o2, Object o3) {
        System.out.println("Uso de EQUALS para comparar" + o1.getClass().getName());
        if (o1.equals(o2))
            System.out.println("o1 == o2");
        else
            System.out.println("o1 != o2");
        if (o1.equals(o3))
            System.out.println("o1 == o3");
        else 
            System.out.println("o1 != o3");
    }
}