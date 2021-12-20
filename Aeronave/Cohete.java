package Aeronave;

import javax.swing.JOptionPane;

public class Cohete extends Aeronave{
    private String propulsor;
    public Cohete(int altitud, int tripulacion, String nombre, String propulsor){
        super(altitud, tripulacion, nombre);
        this.setPropulsor(propulsor);
    }    
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Populsor: " + propulsor;
    }
    public String getPropulsor() {
        return propulsor;
    }
    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }
    @Override
    public void preparar() {
        JOptionPane.showMessageDialog(null, "Preparando al cohete para su almacenamiento...");        
    }
    @Override
    public void preparar(int n) {
        switch(n){
            case 1: 
                JOptionPane.showMessageDialog(null, "Verificando el estado del propulsor...");
                JOptionPane.showMessageDialog(null, "Analizando el estatus del cohete...");
                break;
           
            default :
                JOptionPane.showMessageDialog(null, "No fue pasada una variable");
                break;
        }
    }        
}
