package pctbravo;
public class Base extends Externa.Interna {
    private  String id;
    public Base() {
        new Externa().super();
        id = "PctBravo.Base";
        System.out.println("PctBravo.Base instanciada.");
    }
    public void setId(String id){
        this.id = id;
    }
    @Override 
    public String getId(){
        return id;
    }
}
