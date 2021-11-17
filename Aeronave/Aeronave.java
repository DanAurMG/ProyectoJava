package Aeronave;

public class Aeronave{
    protected static int altitud;
    protected static int tripulacion;
    private String nombre; 
    public Aeronave(int altitud, int tripulacion, String nombre){
        Aeronave.altitud = altitud;
        Aeronave.tripulacion = tripulacion;
        this.setNombre(nombre);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Volar(){
        
    }
}
