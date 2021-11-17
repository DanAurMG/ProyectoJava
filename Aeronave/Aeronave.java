package Aeronave;

public class Aeronave{
    private int altitud;
    private int tripulacion;
    private String nombre; 
    public Aeronave(int altitud, int tripulacion, String nombre){
        this.setAltitud(altitud);
        this.setTripulacion(tripulacion);
        this.setNombre(nombre);
    }
    public int getTripulacion() {
        return tripulacion;
    }
    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }
    public int getAltitud() {
        return altitud;
    }
    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
