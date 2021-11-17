package Aeronave;

import org.ietf.jgss.GSSName;

public class Aerostatos extends Aeronave{
    private static String gas;
    //Constructor Aerostatos
    public Aerostatos(int altitud, int tripulacion, String nombre, String gas){
        super(altitud, tripulacion, nombre);
        Aerostatos.setGas(gas);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Gas usado: " + gas + "\n";
    }
    //getter y setters Aerostatos
    public static String getGas() {
        return gas;
    }
    public static void setGas(String gas) {
        Aerostatos.gas = gas;
    }
}
