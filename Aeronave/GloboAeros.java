package Aeronave;

public class GloboAeros extends Aerostatos{
    private String valvula;
    private String lastre;
    public GloboAeros(int altitud, int tripulacion, String nombre, String gas, String valvula, String lastre){
        super(altitud, tripulacion, nombre, gas);
        this.setValvula(valvula);
        this.setLastre(lastre);
    }
    public String getLastre() {
        return lastre;
    }
    public void setLastre(String lastre) {
        this.lastre = lastre;
    }
    public String getValvula() {
        return valvula;
    }
    public void setValvula(String valvula) {
        this.valvula = valvula;
    }
    
}
