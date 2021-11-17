package Aeronave;

public class Avion extends Aeronave{
    private String turbinas;
    private String trenAterrizaje;
    public Avion(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje){
        super(altitud, tripulacion, nombre);
        this.setTurbinas(turbinas);
        this.setTrenAterrizaje(trenAterrizaje);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Turbinas: " +turbinas + "\n Tren Aterrizaje" + trenAterrizaje +"\n";
    }
    public String getTurbinas() {
        return turbinas;
    }
    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }
    public String getTrenAterrizaje() {
        return trenAterrizaje;
    }
    public void setTrenAterrizaje(String trenAterrizaje) {
        this.trenAterrizaje = trenAterrizaje;
    }
}
