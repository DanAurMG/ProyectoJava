package Aeronave;

public class Comercial extends Avion{
    private int pasajeros;
    public Comercial(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje, int pasajeros){
        super(altitud, tripulacion, nombre, turbinas, trenAterrizaje);
        this.setPasajeros(pasajeros);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Cantidad de pasajeros: " + pasajeros + "\n";
    }

    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
