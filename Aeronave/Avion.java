package Aeronave;

import javax.swing.JOptionPane;

public class Avion extends Aeronave{
    private String turbinas;
    private String trenAterrizaje;
    public Avion(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje){
        super(altitud, tripulacion, nombre);
        this.setTurbinas(turbinas);
        this.setTrenAterrizaje(trenAterrizaje);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Turbinas: " + turbinas + "\n Tren de aterrizaje: " + trenAterrizaje +"\n";
    }
    public void Volar(String destino){
        if(destino != null){
            System.out.println("Comenzando viaje...");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Llegando al destino");
        }
    }
    //Sobrecarga de métodos
    public void Volar(String destino, int paradas){
        if(destino != null){
            System.out.println("Comenzando viaje...");
            for(int i = 0; i< paradas; i++){
                System.out.println("Llegando a la parada numero " + i);
            }
            System.out.println("Llegando al destino");
        }
    }
    public String getTurbinas() {
        return turbinas;
    }
    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }
    public String getTrenAterrizaje() {
        return trenAterrizaje;
    }
    public void setTrenAterrizaje(String trenAterrizaje) {
        this.trenAterrizaje = trenAterrizaje;
    }
    @Override
    public void preparar() {
        JOptionPane.showMessageDialog(null, "El avion comenzara a ser preparado:");
    }
    @Override
    public void preparar(int n) {    
        switch(n){
            case 1: 
                JOptionPane.showMessageDialog(null, "Cargando armas...");
                JOptionPane.showMessageDialog(null, "Asignando soldados...");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Contando asientos...");
                JOptionPane.showMessageDialog(null, "Creando boletos...");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Llenando el manifiesto...");
                JOptionPane.showMessageDialog(null, "Cargando el avion...");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Comprobando la propiedad del avion...");
                JOptionPane.showMessageDialog(null, "Cargando el entretenimiento...");
                break;
            default :
                JOptionPane.showMessageDialog(null, "No fue pasada una variable");
                break;
        }
    }
}
