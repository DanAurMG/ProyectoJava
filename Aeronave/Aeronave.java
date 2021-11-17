package Aeronave;

public class Aeronave{
    //Uso de encapsulamiento
    private int altitud;
    private int tripulacion;
    private String nombre; 

    //Constructor Aeronave
    public Aeronave(int altitud, int tripulacion, String nombre){
        this.setAltitud(altitud);
        this.setTripulacion(tripulacion);
        this.setNombre(nombre);
    }
    public String general(){
        return "\nTipo de aeronave: " + this.getClass().getSimpleName() + "\n Altitud: " + altitud + "m" + "\n Tripulacion en cantidad: " + tripulacion + "\n Nombre aeronave: " + nombre + "\n";
    }
    public String listarDatos(){
        return "\nTipo de aeronave: " + this.getClass().getSimpleName() + "\n Altitud: " + altitud + "m" + "\n Tripulacion en cantidad: " + tripulacion + "\n Nombre aeoranve: " + nombre + "\n";
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
