package Aeronave;

public class PrivadoH extends Helicoptero{
    private String heladeras;
    public PrivadoH(int altitud, int tripulacion, String nombre, String helices, String heladeras){
        super(altitud, tripulacion, nombre, helices);
        this.setHeladeras(heladeras);
        
    }
    public String getHeladeras() {
        return heladeras;
    }
    public void setHeladeras(String heladeras) {
        this.heladeras = heladeras;
    }
    
}
