package Aeronave;

import javax.swing.JOptionPane;

public class Helicoptero extends Aeronave{
    private String helices;
    public Helicoptero(int altitud, int tripulacion, String nombre, String helices){
        super(altitud, tripulacion, nombre);
        this.setHelices(helices);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Modelo helices: " + helices + "\n";
    }
    public String getHelices() {
        return helices;
    }
    public void setHelices(String helices) {
        this.helices = helices;
    }
    @Override
    public void preparar() {
        JOptionPane.showMessageDialog(null, "Se comenzara a preparar el helicoptero:");
        
    }
    
    @Override
    public void preparar(int n) {
        switch(n){
            case 1: 
                JOptionPane.showMessageDialog(null, "Fijando armas...");
                JOptionPane.showMessageDialog(null, "Estableciendo puestos...");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Subiendo equipo...");
                JOptionPane.showMessageDialog(null, "Asignando a clinica...");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Comprobando la propiedad del helicoptero...");
                JOptionPane.showMessageDialog(null, "Llenando las hieleras...");
                break;
            default :
                JOptionPane.showMessageDialog(null, "No fue pasada una variable");
                break;
        }
    }
}
