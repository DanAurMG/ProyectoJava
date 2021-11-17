package Empresa.Aviones;

import Empresa.Avion;

public class Turbina extends Avion{
    private String modelo;
    private String marca;
    private String estatus;
    protected int numSerie;
    public String getModelo(){
        return modelo;
    }
    public void setModelo(){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(){
        this.marca = marca;
    }
    public String getEstatus(){
        return estatus;
    }
    public void setEstatus(){
        this.estatus = estatus;
    }
}
