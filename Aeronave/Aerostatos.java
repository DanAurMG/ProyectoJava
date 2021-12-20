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
    public void preparar() {
        JOptionPane.showMessageDialog(null, "Llenando el deposito con: " + gas);
        JOptionPane.showMessageDialog(null, "Terminando de anadir el aerostato");       
        
    }
    @Override
    public void preparar(int n) {
        switch(n){
            case 1: 
                JOptionPane.showMessageDialog(null, "Colocando la propaganda...");
                JOptionPane.showMessageDialog(null, "Colocando el timonel...");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Verificando la valvula...");
                JOptionPane.showMessageDialog(null, "Contabilizando el lastre...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No fue pasada una variable");
                break;
        
        }
    }
}
