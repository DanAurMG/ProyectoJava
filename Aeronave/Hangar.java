package Aeronave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class Hangar{
    //Uso de objetos de clases agregadas 
    private List<Aeronave>lista;
    
    public Hangar(){
        lista = new ArrayList<>();
    }
    public static void LimpiarConsola(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void registrar(Aeronave aeronave){
        lista.add(aeronave);
    }
    public List<Aeronave> getLista(){
        return lista;
    }
    static Scanner teclas = new Scanner (System.in);
    static Hangar hangar = new Hangar();
    public static void salir(){
        System.out.println("\n Programa finalizado");
        System.exit(0);
    }
    public static void error(){
        System.out.println("\n Opcion Incorrecta");
        menu();
    }
    public static void listar(){
        int bandera = 0;
        for(Aeronave aeronave : hangar.getLista()){
            System.out.println(aeronave.general());
            bandera++;
        }
        if(bandera == 0)
            System.out.println("No hay elementos registrados");
        menu();
    }
    public static void listarEsp(){
        int bandera = 0;
        for(Aeronave aeronave : hangar.getLista()){
            System.out.println(aeronave.general());
            bandera++;
        }
        if(bandera == 0)
            System.out.println("No hay elementos registrados");
        menu();
    }

    public static void menu(){
        System.out.println("1. Agregar");
        System.out.println("2. Listado general");
        System.out.println("3. Listado tecnico");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println("Elija la opcion: ");
        
        int op = teclas.nextInt();
        LimpiarConsola();
        switch (op) {
            case 1:
                agregar();
                break;
            case 2: 
                listar();
                break;
            case 3: 
                listarEsp();
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
        System.out.println("3. Aerostatos");
        System.out.println("4. Cohete");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch (opc) {
            case 1:
                avion();
                break;
            case 2: 
                heli();
                break;
            case 3: 
                aero();
            case 4: 
                cohete();
            default:
                break;
        }
    }
    public static void busqueda(){
        System.out.println("1. Avion");
        System.out.println("2. Helicoptero");
        System.out.println("3. Cohete");
        System.out.println("4. Aerostatos");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch (opc) {
            case 1:
                avion();
                break;
            case 2: 
                heli();
                break;
            case 3: 
                aero();
            case 4: 
                cohete();
            default:
                break;
        }
    }
    public static void eliminar(){
        System.out.println("1. Avion");
        System.out.println("2. Helicoptero");
        System.out.println("3. Cohete");
        System.out.println("4. Aerostatos");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch (opc) {
            case 1:
                avion();
                break;
            case 2: 
                heli();
                break;
            case 3: 
                aero();
            case 4: 
                cohete();
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
        LimpiarConsola();
        switch (opc) {
            case 1:
                miliA();
                break;
            case 2: 
                comer();
                break;
            case 3: 
                carga();
                break;
            case 4: 
                priv();
                break;
            default:
                break;
        }
    }
    public static void heli(){
        System.out.println("1. Militar");
        System.out.println("2. Rescate");
        System.out.println("3. Privado");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch(opc){
            case 1:
                miliH();
                break;
            case 2:
                resc();
                break;
            case 3:
                privH();
                break;
            default:
                break;
        }
    }    
    public static void aero(){
        System.out.println("1. Dirigible");
        System.out.println("2. Globo Aeorstatico");        
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch(opc){
            case 1:
                dirig();
                break;
            case 2:
                globo();
                break;
            default:
                break;
        }
    }
    public static void cohete(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el propulsor del cohete: ");
        String propulsor = teclas.next();
        Cohete ch = new Cohete(altitud, tripulantes, nombre, propulsor);
        hangar.registrar(ch);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void miliA(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas =  teclas.next();
        System.out.println("Ingrese modelo de tren de aterrizaje: ");
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
        LimpiarConsola();
        menu();
    }
    public static void comer(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas =  teclas.next();
        System.out.println("Ingrese modelo de tren de aterrizaje: ");
        String trenAterrizaje = teclas.next();
        System.out.println("Ingrese la capacidad de pasajeros: ");
        int pasajeros = teclas.nextInt();        
        Comercial com = new Comercial(altitud, tripulantes, nombre, turbinas, trenAterrizaje, pasajeros);
        hangar.registrar(com);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void carga(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas =  teclas.next();
        System.out.println("Ingrese modelo de tren de aterrizaje: ");
        String trenAterrizaje = teclas.next();
        System.out.println("Ingrese el estatus del manifiesto: ");
        String manifiesto = teclas.next();
        System.out.println("Ingrese los principales suministros que transporta");
        String suministros = teclas.next();
        Carga car = new Carga(altitud, tripulantes, nombre, turbinas, trenAterrizaje, suministros, manifiesto);
        hangar.registrar(car);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void priv(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas =  teclas.next();
        System.out.println("Ingrese modelo de tren de aterrizaje: ");
        String trenAterrizaje = teclas.next();
        System.out.println("Introduzca el nombre del dueno: ");
        String dueno = teclas.next();
        System.out.println("Introduzca el principal entretenimiento(tele, juegos, chef, etc.): ");
        String entretenimiento = teclas.next();
        Privado priv = new Privado(altitud, tripulantes, nombre, turbinas, trenAterrizaje, dueno, entretenimiento);
        hangar.registrar(priv);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void miliH(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el modelo de las helices: ");
        String helices = teclas.next();
        System.out.println("Introduzca el arma principal usada a bordo: ");
        String armas = teclas.next();
        System.out.println("Introduzca el numero de brigada a la que pertenece: ");
        int brigada = teclas.nextInt();
        MilitarH milih = new MilitarH(altitud, tripulantes, nombre, helices, armas, brigada);
        hangar.registrar(milih);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void resc(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el modelo de las helices: ");
        String helices = teclas.next();
        System.out.println("Ingrese el numero de clínica a la que pertenece el helicoptero: ");
        int hospital = teclas.nextInt();
        System.out.println("Ingrese el nombre del equipo(resucitacion, hipotermia, catastrofe, etc.): ");
        String equipo = teclas.next();
        Rescate resc = new Rescate(altitud, tripulantes, nombre, helices, hospital, equipo);
        hangar.registrar(resc);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void privH(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el modelo de las helices: ");
        String helices = teclas.next();
        System.out.println("Ingrese el tipo de heladeras del helicoptero: ");
        String heladeras = teclas.next();
        PrivadoH privH = new PrivadoH(altitud, tripulantes, nombre, helices, heladeras);
        hangar.registrar(privH);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void dirig(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el gas empleado: ");
        String gas = teclas.next();
        System.out.println("Ingrese el estado del timonel(original, por cambiar, etc.): ");
        String timonel = teclas.next();
        System.out.println("Introduzca la empresa que se promociona");
        String empresa = teclas.next();
        Dirigible dirig = new Dirigible(altitud, tripulantes, nombre, gas, timonel, empresa);
        hangar.registrar(dirig);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
    public static void globo(){
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese el gas empleado: ");
        String gas = teclas.next();
        System.out.println("Ingrese el material de la valvula(grafeno, cobre, hierro): ");
        String valvula = teclas.next();
        System.out.println("Ingrese el peso en kilos total del lastre: ");
        String lastre = teclas.next();
        GloboAeros globo = new GloboAeros(altitud, tripulantes, nombre, gas, valvula, lastre);
        hangar.registrar(globo);
        System.out.println("--------------------------");
        System.out.println("-----REGISTRO GUARDADO----");
        System.out.println("--------------------------");
        LimpiarConsola();
        menu();
    }
}
