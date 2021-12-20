package Aeronave;

import javax.swing.JOptionPane;

public class Aerostatos extends Aeronave{
    private static String gas;
    //Constructor Aerostatos
    public Aerostatos(int altitud, int tripulacion, String nombre, String gas){
        super(altitud, tripulacion, nombre);
        Aerostatos.setGas(gas);
    }
    @Override
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
    @Override
    public void volar() {
        JOptionPane.showMessageDialog(null, "Vuela con: " + gas);
        System.out.println("Vuela con: " + gas);
    }
    @Override
    public void name() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public int llenarse() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void cargar() {
        // TODO Auto-generated method stub
        
    }
}
