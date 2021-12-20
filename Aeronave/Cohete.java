package Aeronave;

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
