package Aeronave;

public class GloboAeros extends Aerostatos{
    private String valvula;
    private int lastre;
    public GloboAeros(int altitud, int tripulacion, String nombre, String gas, String valvula, int lastre2){
        super(altitud, tripulacion, nombre, gas);
        this.setValvula(valvula);
        this.setLastre(lastre2);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Tipo de lastre: " + lastre + "\n Material de la valvula: " + valvula + "\n";
    }
    public int getLastre() {
        return lastre;
    }
    public void setLastre(int lastre2) {
        this.lastre = lastre2;
    }
    public String getValvula() {
        return valvula;
    }
    public void setValvula(String valvula) {
        this.valvula = valvula;
    }
    
}
