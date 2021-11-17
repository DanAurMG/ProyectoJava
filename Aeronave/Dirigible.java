package Aeronave;

public class Dirigible extends Aerostatos{
    private String timonel;
    private String empresa;
    public Dirigible(int altitud, int tripulacion, String nombre, String gas, String timonel, String empresa){
        super(altitud, tripulacion, nombre, gas);
        this.setTimonel(timonel);
        this.setEmpresa(empresa);
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getTimonel() {
        return timonel;
    }
    public void setTimonel(String timonel) {
        this.timonel = timonel;
    }
    
}
