package Empresa.PersonalA;

import Empresa.Aviones.Asientos.Clase;

public class Menu extends Clase {
    private String proteina;
    private String bebida;
    private String postre;
    private String ensalada;

    public Menu(String proteina, String bebida, String postre, String ensalada){
        this.proteina = proteina;
        this.bebida = bebida;
        this.postre = postre;
        this.ensalada = ensalada;
        
    }

    public String getProteina(){
        return proteina;
    }
    public void setProteina(String proteina){
        this.proteina = proteina;
    }
    public String getBebida(){
        return bebida;
    }
    public void setBebida(String bebida){
        this.bebida = bebida;
    }
    public String getPostre(){
        return postre;
    }
    public void setPostre(String postre){
        this.postre = postre;
    }
    public String getEnsalada(){
        return bebida;
    }
    public void setEnsalada(String ensalada){
        this.ensalada = ensalada;
    }    
    public String toString(){
        return "Menu: \n" + "Proteina: " + proteina + "Bebida: " + bebida + "Ensalada: " + ensalada + "Postre: " + postre;
    }
}
