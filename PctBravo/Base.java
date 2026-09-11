package PctBravo;
public class Base extends Externa.Interna {
    private final String id;
    public Base() {
        new Externa().super();
        id = "PctBravo.Base";
        System.out.println("PctBravo.Base instanciada.");
    }
}
