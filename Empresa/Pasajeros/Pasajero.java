package Empresa.Pasajeros;

import Empresa.Aviones.Asientos.Clase;

public class Pasajero extends Clase{
    private String nombre;
    private int asiento;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre= nombre;
    }
    public int getAsiento(){
        return asiento;
    }
    public void setAsiento(){
        this.asiento = asiento;
    }
}
