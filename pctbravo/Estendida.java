package pctbravo;

public class Estendida extends Externa.Interna {
    public Estendida() {
        new Externa().super();
        System.out.println("PctBravo.Estendida instanciada.");
    }
    @Override
    public String getId() {
        return super.getId();
    }
}