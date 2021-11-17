package Aeronave;

public class Privado extends Avion{
    private String dueno;
    private String entretenimiento;
    public Privado(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje, String dueno, String entretenimiento){
        super(altitud, tripulacion, nombre, turbinas, trenAterrizaje);
        this.setDueno(dueno);
        this.setEntretenimiento(entretenimiento);
    }
    public String listarDatos(){
        //Uso de super
        return super.listarDatos() + "\n Entretenimiento a bordo: " + entretenimiento + "\n Dueno: " + dueno + "\n";
    }
    public String getEntretenimiento() {
        return entretenimiento;
    }
    public void setEntretenimiento(String entretenimiento) {
        this.entretenimiento = entretenimiento;
    }
    public String getDueno() {
        return dueno;
    }
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
}
