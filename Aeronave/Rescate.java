package Aeronave;

public class Rescate extends Helicoptero{
    private int hospital;
    private String equipo;
    public Rescate(int altitud, int tripulacion, String nombre, String helices, int hospital, String equipo){
        super(altitud, tripulacion, nombre, helices);
        this.setHospital(hospital);
        this.setEquipo(equipo);
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public int getHospital() {
        return hospital;
    }
    public void setHospital(int hospital) {
        this.hospital = hospital;
    }
    
}
