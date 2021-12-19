package Aeronave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.modelmbean.ModelMBeanInfo;
import javax.print.DocFlavor.STRING;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class Hangar extends JFrame implements ActionListener {
    // Declaración del tamaño del Frame
    private static final int WIDTH = 500;
    private static final int HEIGHT = 400;
    // Declaración de las etiquetas para cada caso
    private JButton Agregar, ListGen, ListTec, Eliminar, Salir;
    //Botones luego de agregar
    private  JButton Avion;
    private JButton Helicoptero;
    private JButton Aerostato;
    private JButton Cohete;
    //Botones para cada tipo específico de aeronave
    private JButton MilitarA, Comercial, Carga, PrivadaA, Rescate, Dirigible, GloboAeros;
    private JButton MilitarH, PrivadaH;
    //Textos que llevan todas las aeronaves
    private JTextField Campo1, Campo2, Campo3, CampoA1;
    //Textos máximos que llevan los aviones
    private JTextField CampoA2, CampoA3, CampoA4;
    //Textos máximos que llevan los helicópteros
    private JTextField CampoH1, CampoH2, CampoH3;
    //Texto adicional del cohete
    private JTextField CampoC1;
    //Textos máximos que llevan los aerostatos
    private JTextField CampoAr1, CampoAr2, CamporAr3;
    // Uso de objetos de clases agregadas
    private List<Aeronave> lista;

    public Hangar() {
        lista = new ArrayList<>();
        ventanaMenu();
    }
    @SuppressWarnings("Nya")
    private void ventanaMenu(){
        setTitle("Practica 2 - Munoz Gonzalez, Hernandez Vergara ");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Declaracion botones
        Agregar = new JButton("Dar de alta");
        ListGen = new JButton("Listado general");
        ListTec = new JButton("Listado Tecnico");
        Eliminar = new JButton("Eliminar");
        Salir = new JButton("Salir");
        // Aeronaves
        Avion = new JButton("Avion");
        Helicoptero = new JButton("Helicoptero");
        Aerostato = new JButton("Aerostato");
        Cohete = new JButton("Cohete");
        // Aviones
        MilitarA = new JButton("Militar");
        Comercial = new JButton("Comercial");
        Carga = new JButton("Carga");
        PrivadaA = new JButton("Privada");
        //Helicoptero
        MilitarH = new JButton("Militar");
        PrivadaH = new JButton("Privada");
        Rescate = new JButton("Rescate");
        //Aerostatos
        Dirigible = new JButton("Dirigible");
        GloboAeros = new JButton("GloboAeros");
        //Dimensiones
        Agregar.setBounds(175, 30, 150, 30);
        Avion.setBounds(175, 30, 150, 30);
        MilitarA.setBounds(175, 30, 150, 30);
        MilitarH.setBounds(175, 30, 150, 30);
        Dirigible.setBounds(175, 30, 150, 30);
        ListGen.setBounds(175, 90, 150, 30);
        Helicoptero.setBounds(175, 90, 150, 30);
        PrivadaA.setBounds(175, 90, 150, 30);
        PrivadaH.setBounds(175, 90, 150, 30);
        GloboAeros.setBounds(175, 90, 150, 30);
        ListTec.setBounds(175, 150, 150, 30);
        Aerostato.setBounds(175, 150, 150, 30);
        Carga.setBounds(175, 150, 150, 30);
        Rescate.setBounds(175, 150, 150, 30);
        Eliminar.setBounds(175, 210, 150, 30);
        Cohete.setBounds(175, 210, 150, 30);
        Comercial.setBounds(175, 210, 150, 30);
        Salir.setBounds(175, 270, 150, 30);
        // añadimos funciones
        add(Agregar);
        add(ListGen);
        add(ListTec);
        add(Eliminar);
        add(Salir);
        // añadimos aeronaves
        add(Avion);
        add(Helicoptero);
        add(Aerostato);
        add(Cohete);
        // añadimos especificas
        add(MilitarA);
        add(MilitarH);
        add(Comercial);
        add(Carga);
        add(PrivadaA);
        add(MilitarH);
        add(Rescate);
        add(GloboAeros);
        add(Dirigible);
        //Pa q funcionen los botones
        // Las funciones
        Agregar.addActionListener(this);
        ListGen.addActionListener(this);
        ListTec.addActionListener(this);
        Eliminar.addActionListener(this);
        Salir.addActionListener(this);
        // Las aeronaves
        Avion.addActionListener(this);
        Helicoptero.addActionListener(this);
        Aerostato.addActionListener(this);
        Cohete.addActionListener(this);
        // especificos
        MilitarA.addActionListener(this);
        MilitarH.addActionListener(this);
        Comercial.addActionListener(this);
        Carga.addActionListener(this);
        PrivadaA.addActionListener(this);
        PrivadaH.addActionListener(this);
        Rescate.addActionListener(this);
        GloboAeros.addActionListener(this);
        Dirigible.addActionListener(this);
        //Ocultamos los q no son funciones
        Avion.setVisible(false);
        Helicoptero.setVisible(false);
        Aerostato.setVisible(false);
        Cohete.setVisible(false);
        //especificos
        MilitarA.setVisible(false);
        MilitarH.setVisible(false);
        Comercial.setVisible(false);
        Carga.setVisible(false);
        PrivadaA.setVisible(false);
        PrivadaH.setVisible(false);
        Rescate.setVisible(false);
        GloboAeros.setVisible(false);
        Dirigible.setVisible(false);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Salir) {
                salir();
            }else if(e.getSource() == ListGen){
                listar();
            }else if(e.getSource() == ListTec){
                listarEsp();
            }else if (e.getSource() == Agregar) {
                JOptionPane.showMessageDialog(null, "Esta intentando agregar");
                Agregar.setVisible(false);
                ListGen.setVisible(false);
                ListTec.setVisible(false);
                Eliminar.setVisible(false);
                Avion.setVisible(true);
                Helicoptero.setVisible(true);
                Cohete.setVisible(true);
                Aerostato.setVisible(true);
                //agregarN(e);
            }else if(e.getSource() == Avion){
                Avion.setVisible(false);
                Helicoptero.setVisible(false);
                Cohete.setVisible(false);
                Aerostato.setVisible(false);
                MilitarA.setVisible(true);
                Comercial.setVisible(true);
                Carga.setVisible(true);
                PrivadaA.setVisible(true);
            }else if(e.getSource() == Helicoptero){
                Avion.setVisible(false);
                Helicoptero.setVisible(false);
                Cohete.setVisible(false);
                Aerostato.setVisible(false);
                MilitarH.setVisible(true);
                PrivadaH.setVisible(true);
                Rescate.setVisible(true);
            }else if(e.getSource() == Cohete){
                JOptionPane.showMessageDialog(null, "Volar cual cohete");
            }else if(e.getSource() == Aerostato){
                Avion.setVisible(false);
                Helicoptero.setVisible(false);
                Cohete.setVisible(false);
                Aerostato.setVisible(false);
                Dirigible.setVisible(true);
                GloboAeros.setVisible(true);
            }else if(e.getSource() == MilitarA){
                JOptionPane.showMessageDialog(null, "MilitarAvion");
            }else if(e.getSource() == MilitarH){
                JOptionPane.showMessageDialog(null, "MilitarHelicptero");
            }else if(e.getSource() == PrivadaA){
                JOptionPane.showMessageDialog(null, "Hola siguele");
            }
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    /*------------------------------------------------ Consola -------------------------------------------------------------------------------------------*/
    public static void LimpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void registrar(Aeronave aeronave) {
        lista.add(aeronave);
    }

    public List<Aeronave> getLista() {
        return lista;
    }
    static Scanner teclas = new Scanner(System.in);
    static Hangar hangar = new Hangar();

    public static void salir() {
        System.out.println("\n Programa finalizado");
        System.exit(0);
    }

    public static void error() {
        System.out.println("\n Opcion Incorrecta");
        menu();
    }

    public static void listar() {
        int bandera = 0;
        for (Aeronave aeronave : hangar.getLista()) {
            System.out.println(aeronave.general());
            bandera++;
        }
        if (bandera == 0){
            System.out.println("No hay elementos registrados");
            JOptionPane.showMessageDialog(null, "No hay elementos registrados");
        }
        menu();
    }
    public static void listarEsp() {
        int bandera = 0;
        for (Aeronave aeronave : hangar.getLista()) {
            System.out.println(aeronave.listarDatos());
            JOptionPane.showMessageDialog(null, aeronave.listarDatos());
            bandera++;
        }
        if (bandera == 0){
            System.out.println("No hay elementos registrados");
            JOptionPane.showMessageDialog(null, "No hay elementos registrados");
        }
        menu();
    }

    public static void menu() {
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

    public static void agregar() {
        try {
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
                    break;
                case 4:
                    cohete();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    public static void busqueda() {
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

    public static void eliminar() {
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

    public static void heli() {
        System.out.println("1. Militar");
        System.out.println("2. Rescate");
        System.out.println("3. Privado");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch (opc) {
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

    public static void aero() {
        System.out.println("1. Dirigible");
        System.out.println("2. Globo Aeorstatico");
        int opc = teclas.nextInt();
        LimpiarConsola();
        switch (opc) {
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

    public static void cohete() {
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

    public static void miliA() {
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas = teclas.next();
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

    public static void comer() {
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas = teclas.next();
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

    public static void carga() {
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas = teclas.next();
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

    public static void priv() {
        System.out.println("\n SELECCIONE \n");
        System.out.println("Ingrese altitud maxima en un numero: ");
        int altitud = teclas.nextInt();
        System.out.println("Ingrese numero de tripulantes: ");
        int tripulantes = teclas.nextInt();
        System.out.println("Ingrese nombre de la aeronave: ");
        String nombre = teclas.next();
        System.out.println("Ingrese tipo turbinas: ");
        String turbinas = teclas.next();
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

    public static void miliH() {
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

    public static void resc() {
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

    public static void privH() {
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

    public static void dirig() {
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

    public static void globo() {
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
