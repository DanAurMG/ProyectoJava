package Aeronave;

public class Aerostatos extends Aeronave{
    private static String gas;
    public Aerostatos(int altitud, int tripulacion, String nombre, String gas){
        super(altitud, tripulacion, nombre);
        Aerostatos.setGas(gas);
    }
    public static String getGas() {
        return gas;
    }
    public static void setGas(String gas) {
        Aerostatos.gas = gas;
    }
}
