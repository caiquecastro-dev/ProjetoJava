package PctAlfa;
import PctBravo.*;

class Execucao extends Externa {
    private String id;
    Externa.Interna exint;
    public Execucao () {
        exint = new Externa().new Interna();
        id = "PctAlfa.Execucao";
        System.out.println("PctAlfa.Execucao instanciada." );
    }
    @Override 
    public String getId() {
        return id;
    }
}
public class Principal {
    static Execucao ex;
    public static void main(String [] args) {
        ex = new Execucao();
        System.out.println( ex.getId() );
    }
}