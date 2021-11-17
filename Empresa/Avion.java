package Empresa;

public class Avion extends Vuelos{
    private String marca;
    private String modelo;
    private int pasajeros;
    public void trasportar(){

    }
    public int contarAsientos(){
        return pasajeros;
    }
}
