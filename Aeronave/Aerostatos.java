package Aeronave;

public class Aerostatos extends Aeronave{
    private static String gas;
    //Constructor Aerostatos
    public Aerostatos(int altitud, int tripulacion, String nombre, String gas){
        super(altitud, tripulacion, nombre);
        Aerostatos.setGas(gas);
    }

    //getter y setters Aerostatos
    public static String getGas() {
        return gas;
    }
    public static void setGas(String gas) {
        Aerostatos.gas = gas;
    }
}
