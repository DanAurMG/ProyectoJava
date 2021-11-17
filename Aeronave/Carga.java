package Aeronave;

public class Carga extends Avion{
    private String suministros;
    private String manifiesto;
    public Carga(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje, String suministros, String manifiesto){
        super(altitud, tripulacion, nombre, turbinas, trenAterrizaje);
        this.setSuministros(suministros);
        this.setManifiesto(manifiesto);
    }
    public String getManifiesto() {
        return manifiesto;
    }
    public void setManifiesto(String manifiesto) {
        this.manifiesto = manifiesto;
    }
    public String getSuministros() {
        return suministros;
    }
    public void setSuministros(String suministros) {
        this.suministros = suministros;
    }
}
