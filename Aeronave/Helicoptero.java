package Aeronave;

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
    public void volar() {
        // TODO Auto-generated method stub
        
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
