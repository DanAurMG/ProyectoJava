package Empresa.PersonalA;

import Empresa.Personal;

public class Piloto extends Personal{
    private String Copiloto;
    private int HrsVuelo;
    protected void conducir(){

    }
    private void informar(){

    }
    public String getCopiloto(){
        return Copiloto;
    }
    public void setCopiloto(){
        this.Copiloto= Copiloto;
    }
    public int getHrsVuelo(){
        return HrsVuelo;
    }
    public void setHrsVuelo(){
        this.HrsVuelo = HrsVuelo;
    }
}
