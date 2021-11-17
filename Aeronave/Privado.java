package Aeronave;

public class Privado extends Avion{
    private String dueno;
    private String entretenimiento;
    public Privado(int altitud, int tripulacion, String nombre, String turbinas, String trenAterrizaje, String dueno, String entretenimineto){
        super(altitud, tripulacion, nombre, turbinas, trenAterrizaje);
        this.setDueno(dueno);
        this.setEntretenimiento(entretenimineto);
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
