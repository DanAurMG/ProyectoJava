package Aeronave;

public class MilitarH extends Helicoptero{
    private String armas;
    private int brigada;
    public MilitarH(int altitud, int tripulacion, String nombre, String helices, String armas, int brigada){
        super(altitud, tripulacion, nombre, helices);
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