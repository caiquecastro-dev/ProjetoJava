package PctBravo;
public class Externa {
    private String id;
    public Externa() {
        id  = "PctBravo.Externa";
        System.out.println("PctBravo.Externa instanciada.");
    }
    public class Interna {
    }
}
public class Base extends Externa.Interna {
    private final String id;
    public Base() {
        new Externa().super();
        id = "PctBravo.Base";
        System.out.println("PctBravo.Base instanciada.");
    }
}
