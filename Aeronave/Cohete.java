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
}
