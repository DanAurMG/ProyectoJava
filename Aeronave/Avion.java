package Aeronave;

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
