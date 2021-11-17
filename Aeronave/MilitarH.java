package Aeronave;

public class MilitarH extends Helicoptero{
    private String armas;
    private int brigada;
    public MilitarH(int altitud, int tripulacion, String nombre, String helices, String armas, int brigada){
        super(altitud, tripulacion, nombre, helices);
        this.setArmas(armas);
        this.setBrigada(brigada);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Brigada: " + brigada + "\n Armas: " + armas + "\n";
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