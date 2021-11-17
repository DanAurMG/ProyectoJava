package Empresa;
import java.util.*;
public class Vuelos extends Aerolinea{
    private String destino;
    private String tipo;
    private String fecha;
    private String infoAdicional;
    private int capacidad; 
    
    public static final ArrayList<Asiento> Asientos = new ArrayList<Asiento>();

    public static final ArrayList<Asiento> Vendidos = new ArrayList<Asiento>();
    
    public static void TotalAsientos(int cantidad){
        if (cantidad < 1){
            System.out.println("\nLa cantidad no puede ser menor a 1");
            return;
        }
        for (int i = 0; i < cantidad; i++){
            System.out.println("=== Registrando producto " + (i + 1) + " ===");
            //Uso de constructor
            Asientos.add(new Asiento(Vendidos.size() + Asientos.size() + 1));                
        }
    }

    public static void Vender(int cantidad){ 
        if (cantidad < 1){
            System.out.println("\nLa cantidad no puede ser menor a 1");
            return;
        }       
        for(int i = 0; i < cantidad; i++)
            Vendidos.add(Asientos.remove(i));
        
    }

}