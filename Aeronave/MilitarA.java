package Aeronave;

public class MilitarA extends Avion{
    private String armas;
    private int brigada;
    public MilitarA(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje, String armas, int brigada){
        super(altitud, tripulacion, nombre, turbinas, trenAterrizaje);
        this.setArmas(armas); 
        this.setBrigada(brigada);
    }
    public int getBrigada() {
        return brigada;
    }
    public void setBrigada(int brigada) {
        this.brigada = brigada;
    }
    public String getArmas() {
        return armas;
    }
    public void setArmas(String armas) {
        this.armas = armas;
    }
}