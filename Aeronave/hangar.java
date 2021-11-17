package Aeronave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class hangar {
    private List<Aeronave>lista;
    public hangar(){
        lista = new ArrayList<>();
    }
    public void registrar(Aeronave aeronave){
        lista.add(aeronave);
    }
    public List<Aeronave> getLista(){
        return lista;
    }
    static Scanner teclas = new Scanner (System.in);
    static hangar hangar = new hangar();
    public static void salir(){
        System.out.println("\n Programa finalizado");
        System.exit(0);
    }
    public static void error(){
        System.out.println("\n Opcion Incorrecta");
        menu();
    }
    public static void listar(){
        for(Aeronave aeronave : hangar.getLista()){
            System.out.println(aeronave.listarDatos());
        }
    }
    public static void menu(){
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println("Elija la opcion: ");
        int op = teclas.nextInt();
        switch (op) {
            case 1:
                agregar();
                break;
            case 2: 
                listar();
                break;
            case 3: 
                busqueda();
                break;
            case 4: 
                eliminar();
                break;
            case 5: 
                salir();
                break;
            default:
                break;
        }
    }
    public static void agregar(){
        System.out.println("1. Avion");
        System.out.println("2. Helicoptero");
        System.out.println("3. Cohete");
        System.out.println("4. Aerostatos");
        int opc = teclas.nextInt();
        switch (opc) {
            case 1:
                avion();
                break;
            case 2: 
                heli();
                break;
            case 3: 
                cohete();
            case 4: 
                aero();
            default:
                break;
        }
    }
    public static void avion() {
        System.out.println("1. Militar");
        System.out.println("2. Comercial");
        System.out.println("3. Carga");
        System.out.println("4. Privada");
        int opc = teclas.nextInt();
        switch (opc) {
            case 1:
                miliA();
                break;
            case 2: 
                comer();
                break;
            case 3: 
                carga();
            case 4: 
                priv();
            default:
                break;
        }
    }
    public static void miliA(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas =  teclas.next();
        System.out.println("Ingrese mod tren de aterrizaje: ");
        String trenAterrizaje = teclas.next();
        System.out.println("Ingrese tipo de armas: ");
        String armas = teclas.next();
        System.out.println("Ingrese numero de brigada: ");
        int brigada = teclas.nextInt();
        MilitarA mA = new MilitarA(altitud, tripulantes, nombre, turbinas, trenAterrizaje, armas, brigada);
        hangar.registrar(mA);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        menu();
    }
}
