package Aeronave;

public class Helicoptero extends Aeronave{
    private String helices;
    public Helicoptero(int altitud, int tripulacion, String nombre, String helices){
        super(altitud, tripulacion, nombre);
        this.setHelices(helices);
    }
    public String getHelices() {
        return helices;
    }
    public void setHelices(String helices) {
        this.helices = helices;
    }
}
