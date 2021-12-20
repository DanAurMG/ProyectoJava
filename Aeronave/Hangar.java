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
    private JButton Agregar, ListGen, ListTec, Otros, Salir;
    //Botones luego de agregar
    private static  JButton Avion;
    private JButton Helicoptero;
    private JButton Aerostato;
    private JButton Cohete;
    //Botones para cada tipo específico de aeronave
    private JButton MilitarA, Comercial, Carga, PrivadaA, Rescate, Dirigible, GloboAeros;
    private JButton MilitarH, PrivadaH;
    //Botones para agregar
    private JButton Agregar1,Agregar2, Agregar3, Agregar4, Agregar5, Agregar6, Agregar7, Agregar8, Agregar9, Agregar10;
    //Textos que llevan todas las aeronaves
    private JTextField Campo1, Campo2, Campo3;
    //Textos máximos que llevan los aviones
    private JTextField CampoA1, CampoA2, CampoA3, CampoA4;
    //Textos máximos que llevan los helicópteros
    private JTextField CampoH1, CampoH2, CampoH3;
    //Texto adicional del cohete
    private JTextField CampoC1;
    //Textos máximos que llevan los aerostatos
    private JTextField CampoAr1, CampoAr2, CampoAr3;
    //Labels
    private JLabel Etiqueta1, Etiqueta2, Etiqueta3, Etiqueta4, Etiqueta5, Etiqueta6, Etiqueta7;
    // Uso de objetos de clases agregadas
    private List<Aeronave> lista;

    public Hangar() {
        lista = new ArrayList<>();
        ventanaMenu();
    }
    @SuppressWarnings("Proyecto")
    private void ventanaMenu(){
        setTitle("Practica 2 - Munoz Gonzalez, Hernandez Vergara ");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Declaracion botones
        Agregar = new JButton("Dar de alta");
        ListGen = new JButton("Listado general");
        ListTec = new JButton("Listado Tecnico");
        Otros = new JButton("Otras funciones ");
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
        //Botones de agregación
        Agregar1 = new JButton("Agregar");
        Agregar2 = new JButton("Agregar");
        Agregar3 = new JButton("Agregar");
        Agregar4 = new JButton("Agregar");
        Agregar5 = new JButton("Agregar");
        Agregar6 = new JButton("Agregar");
        Agregar7 = new JButton("Agregar");
        Agregar8 = new JButton("Agregar");
        Agregar9 = new JButton("Agregar");
        Agregar10 = new JButton("Agregar");
        //Declaración de campos base
        Campo1 = new JTextField();
        Campo2 = new JTextField();
        Campo3 = new JTextField();
        //Campos solo de avion
        CampoA1 = new JTextField();
        CampoA2 = new JTextField();
        CampoA3 = new JTextField();
        CampoA4 = new JTextField();
        //Campos solo de erostatos
        CampoAr1 = new JTextField();
        CampoAr2 = new JTextField();
        CampoAr3 = new JTextField();
        //Campo de Cohete
        CampoC1 = new JTextField();
        //Campos de helicoptero
        CampoH1 = new JTextField();
        CampoH2 = new JTextField();
        CampoH3 = new JTextField();
        //Labels
        Etiqueta1 = new JLabel("En numero, la altitud maxima");
        Etiqueta2 = new JLabel("En numero, la tripulacion");
        Etiqueta3 = new JLabel("Nombre de la aeronave");
        Etiqueta4 = new JLabel("");
        Etiqueta5 = new JLabel("");
        Etiqueta6 = new JLabel("");
        Etiqueta7 = new JLabel("");
        //Dimensiones
        Agregar.setBounds(175, 30, 150, 30);
        Campo1.setBounds(215,25,150,30);
        Etiqueta1.setBounds(35,25,180,30);
        Campo2.setBounds(215,65,150,30);
        Etiqueta2.setBounds(35,65,180,30);
        Campo3.setBounds(215,105,150,30);
        Etiqueta3.setBounds(35,105,180,30);
        Avion.setBounds(175, 30, 150, 30);
        CampoA1.setBounds(215,145,150,30);
        CampoAr1.setBounds(215,145,150,30);
        CampoH1.setBounds(215,145,150,30);
        CampoC1.setBounds(215,145,150,30);
        Etiqueta4.setBounds(35,145,180,30);
        CampoA2.setBounds(215,185,150,30);
        CampoAr2.setBounds(215,185,150,30);
        CampoH2.setBounds(215,185,150,30);
        Etiqueta5.setBounds(35,185,180,30);
        CampoA3.setBounds(215,225,150,30);
        CampoAr3.setBounds(215,225,150,30);
        CampoH3.setBounds(215,225,150,30);
        Etiqueta6.setBounds(35,225,180,30);
        CampoA4.setBounds(215,265,150,30);
        Etiqueta7.setBounds(35,265,180,30);
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
        Otros.setBounds(175, 210, 150, 30);
        Cohete.setBounds(175, 210, 150, 30);
        Comercial.setBounds(175, 210, 150, 30);
        Salir.setBounds(175, 270, 150, 30);
        Agregar1.setBounds(175, 310, 150, 30);
        Agregar2.setBounds(175, 310, 150, 30);
        Agregar3.setBounds(175, 310, 150, 30);
        Agregar4.setBounds(175, 310, 150, 30);
        Agregar5.setBounds(175, 310, 150, 30);
        Agregar6.setBounds(175, 310, 150, 30);
        Agregar7.setBounds(175, 310, 150, 30);
        Agregar8.setBounds(175, 310, 150, 30);
        Agregar9.setBounds(175, 310, 150, 30);
        Agregar10.setBounds(175, 310, 150, 30);
        //Añadimos funciones
        add(Agregar);
        add(ListGen);
        add(ListTec);
        //add(Otros);
        add(Salir);
        //Añadimos aeronaves
        add(Avion);
        add(Helicoptero);
        add(Aerostato);
        add(Cohete);
        //Añadimos especificas
        add(MilitarA);
        add(Comercial);
        add(Carga);
        add(PrivadaA);
        add(MilitarH);
        add(PrivadaH);
        add(MilitarH);
        add(Rescate);
        add(GloboAeros);
        add(Dirigible);
        //Añadimos los campos
        add(Campo1);
        add(Campo2);
        add(Campo3);
        add(CampoA1);
        add(CampoA2);
        add(CampoA3);
        add(CampoA4);
        add(CampoAr1);
        add(CampoAr2);
        add(CampoAr3);
        add(CampoC1);
        add(CampoH1);
        add(CampoH2);
        add(CampoH3);
        //Añadimos los botones de agregar
        add(Agregar1);
        add(Agregar2);
        add(Agregar3);
        add(Agregar4);
        add(Agregar5);
        add(Agregar6);
        add(Agregar7);
        add(Agregar8);
        add(Agregar9);   
        add(Agregar10);  
        //Añadimos las labels 
        add(Etiqueta1);
        add(Etiqueta2);
        add(Etiqueta3);
        add(Etiqueta4);
        add(Etiqueta5);
        add(Etiqueta6);
        add(Etiqueta7);
        //Listeners para los eventos
        //Las funciones
        Agregar.addActionListener(this);
        ListGen.addActionListener(this);
        ListTec.addActionListener(this);
        Otros.addActionListener(this);
        Salir.addActionListener(this);
        //Las aeronaves
        Avion.addActionListener(this);
        Helicoptero.addActionListener(this);
        Aerostato.addActionListener(this);
        Cohete.addActionListener(this);
        //Tipo especificos
        MilitarA.addActionListener(this);
        MilitarH.addActionListener(this);
        Comercial.addActionListener(this);
        Carga.addActionListener(this);
        PrivadaA.addActionListener(this);
        PrivadaH.addActionListener(this);
        Rescate.addActionListener(this);
        GloboAeros.addActionListener(this);
        Dirigible.addActionListener(this);
        //Agregación
        Agregar1.addActionListener(this);
        Agregar2.addActionListener(this);
        Agregar3.addActionListener(this);
        Agregar4.addActionListener(this);
        Agregar5.addActionListener(this);
        Agregar6.addActionListener(this);
        Agregar7.addActionListener(this);
        Agregar8.addActionListener(this);
        Agregar9.addActionListener(this);
        Agregar10.addActionListener(this);
        //Ocultamos los que no son funciones
        Avion.setVisible(false);
        Helicoptero.setVisible(false);
        Aerostato.setVisible(false);
        Cohete.setVisible(false);
        MilitarA.setVisible(false);
        MilitarH.setVisible(false);
        Comercial.setVisible(false);
        Carga.setVisible(false);
        PrivadaA.setVisible(false);
        PrivadaH.setVisible(false);
        Rescate.setVisible(false);
        GloboAeros.setVisible(false);
        Dirigible.setVisible(false);
        //Botones de agregar
        Agregar1.setVisible(false);
        Agregar2.setVisible(false);
        Agregar3.setVisible(false);
        Agregar4.setVisible(false);
        Agregar5.setVisible(false);
        Agregar6.setVisible(false);
        Agregar7.setVisible(false);
        Agregar8.setVisible(false);
        Agregar9.setVisible(false);
        Agregar10.setVisible(false);
        //Visibilidad de los campos
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        CampoA1.setVisible(false);
        CampoA2.setVisible(false);
        CampoA3.setVisible(false);
        CampoA4.setVisible(false);
        CampoAr1.setVisible(false);
        CampoAr2.setVisible(false);
        CampoAr3.setVisible(false);
        CampoC1.setVisible(false);
        CampoH1.setVisible(false);
        CampoH2.setVisible(false);
        CampoH3.setVisible(false);
        //Visibilidad de las labels
        Etiqueta1.setVisible(false);
        Etiqueta2.setVisible(false);
        Etiqueta3.setVisible(false);
        Etiqueta4.setVisible(false);
        Etiqueta5.setVisible(false);
        Etiqueta5.setVisible(false);
        Etiqueta7.setVisible(false);
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
                //((Inteface) Avion).preparar();
            }else if (e.getSource() == Agregar) {                
                Agregar.setVisible(false);
                ListGen.setVisible(false);
                ListTec.setVisible(false);
                Otros.setVisible(false);
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
                Avion.setVisible(false);
                Helicoptero.setVisible(false);
                Cohete.setVisible(false);
                Aerostato.setVisible(false);
                Agregar10.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoC1.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta4.setText("Modelo de propulsor");                
            }else if(e.getSource() == Aerostato){
                Avion.setVisible(false);
                Helicoptero.setVisible(false);
                Cohete.setVisible(false);
                Aerostato.setVisible(false);
                Dirigible.setVisible(true);
                GloboAeros.setVisible(true);
                
            }else if(e.getSource() == MilitarA){                
                MilitarA.setVisible(false);
                PrivadaA.setVisible(false);
                Carga.setVisible(false);
                Comercial.setVisible(false);
                Agregar1.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoA1.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta4.setText("Modelo de turbinas");
                CampoA2.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta5.setText("Tren de aterrizaje");
                CampoA3.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta6.setText("Tipo de armas");
                CampoA4.setVisible(true);
                Etiqueta7.setVisible(true);
                Etiqueta7.setText("Numero de brigada");
            }else if(e.getSource() == Comercial){
                MilitarA.setVisible(false);
                PrivadaA.setVisible(false);
                Carga.setVisible(false);
                Comercial.setVisible(false);
                Agregar2.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoA1.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta4.setText("Modelo de turbinas");
                CampoA2.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta5.setText("Tren de aterrizaje");
                CampoA3.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta6.setText("En numero, pasajeros maximos");                
            }else if(e.getSource() == Carga){
                MilitarA.setVisible(false);
                PrivadaA.setVisible(false);
                Carga.setVisible(false);
                Comercial.setVisible(false);
                Agregar3.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoA1.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta4.setText("Modelo de turbinas");
                CampoA2.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta5.setText("Tren de aterrizaje");
                CampoA3.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta6.setText("Suministros transportados");
                CampoA4.setVisible(true);
                Etiqueta7.setVisible(true);
                Etiqueta7.setText("Estatus del manifiesto");
            }else if(e.getSource() == PrivadaA){
                MilitarA.setVisible(false);
                PrivadaA.setVisible(false);
                Carga.setVisible(false);
                Comercial.setVisible(false);
                Agregar4.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoA1.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta4.setText("Modelo de turbinas");
                CampoA2.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta5.setText("Tren de aterrizaje");
                CampoA3.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta6.setText("Nombre del dueno");
                CampoA4.setVisible(true);
                Etiqueta7.setVisible(true);
                Etiqueta7.setText("Principal entretenimiento");
            }else if(e.getSource() == MilitarH){
                MilitarH.setVisible(false);
                PrivadaH.setVisible(false);
                Rescate.setVisible(false);
                Agregar5.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoH1.setVisible(true);
                CampoH2.setVisible(true);
                CampoH3.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta4.setText("Modelo de helices");
                Etiqueta5.setText("Tipos de armas");
                Etiqueta6.setText("Numero de brigada");
            }else if(e.getSource() == Rescate){
                MilitarH.setVisible(false);
                PrivadaH.setVisible(false);
                Rescate.setVisible(false);
                Agregar6.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoH1.setVisible(true);
                CampoH2.setVisible(true);
                CampoH3.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta4.setText("Modelo de helices");
                Etiqueta5.setText("Numero de la clinica");
                Etiqueta6.setText("Equipo que transporta");
            }else if(e.getSource() == PrivadaH){
                MilitarH.setVisible(false);
                PrivadaH.setVisible(false);
                Rescate.setVisible(false);
                Agregar7.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoH1.setVisible(true);
                CampoH2.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta4.setText("Modelo de helices");
                Etiqueta5.setText("Marca de la heladera");
            }else if(e.getSource() == Dirigible){
                Dirigible.setVisible(false);
                GloboAeros.setVisible(false);
                Agregar8.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoAr1.setVisible(true);
                CampoAr2.setVisible(true);
                CampoAr3.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta4.setText("Gas usado para volar");
                Etiqueta5.setText("Marca del timonel");
                Etiqueta6.setText("Empresa patrocinadora");
            }else if(e.getSource() == GloboAeros){
                Dirigible.setVisible(false);
                GloboAeros.setVisible(false);
                Agregar9.setVisible(true);
                Salir.setBounds(175, 355, 150, 30);
                Campo1.setVisible(true);
                Etiqueta1.setVisible(true);
                Campo2.setVisible(true);
                Etiqueta2.setVisible(true);
                Campo3.setVisible(true);
                Etiqueta3.setVisible(true);
                CampoAr1.setVisible(true);
                CampoAr2.setVisible(true);
                CampoAr3.setVisible(true);
                Etiqueta4.setVisible(true);
                Etiqueta5.setVisible(true);
                Etiqueta6.setVisible(true);
                Etiqueta4.setText("Gas usado para volar");
                Etiqueta5.setText("Marca de la valvula");
                Etiqueta6.setText("Peso en kilos del lastre");
            }else if(e.getSource() == Agregar1){ 
                try{
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String turbinas = CampoA1.getText();
                    String trenAterrizaje = CampoA2.getText();
                    String armas = CampoA3.getText();                
                    int brigada = Integer.parseInt(CampoA4.getText());                              
                    MilitarA mA = new MilitarA(altitud, tripulacion, nombre, turbinas, trenAterrizaje, armas, brigada);
                    hangar.registrar(mA);
                    mA.preparar();
                    mA.preparar(1);
                    JOptionPane.showMessageDialog(null, "Agregado");  
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoA1.setText("");
                    CampoA2.setText("");
                    CampoA3.setText("");
                    CampoA4.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoA1.setVisible(false);
                    CampoA2.setVisible(false);
                    CampoA3.setVisible(false);
                    CampoA4.setVisible(false);               
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Etiqueta7.setVisible(false); 
                    Agregar1.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    CampoA4.setText("");
                    ex.printStackTrace();                    
                }
            }else if(e.getSource() == Agregar2){
                try{
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String turbinas = CampoA1.getText();
                    String trenAterrizaje = CampoA2.getText();
                    int pasajeros = Integer.parseInt(CampoA3.getText());                                             
                    Comercial aC = new Comercial(altitud, tripulacion, nombre, turbinas, trenAterrizaje, pasajeros);
                    hangar.registrar(aC);
                    aC.preparar();
                    aC.preparar(2);
                    JOptionPane.showMessageDialog(null, "Agregado");  
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoA1.setText("");
                    CampoA2.setText("");
                    CampoA3.setText("");                
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoA1.setVisible(false);
                    CampoA2.setVisible(false);
                    CampoA3.setVisible(false);
                    CampoA4.setVisible(false);                            
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);                
                    Agregar2.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    CampoA3.setText("");  
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar3){
                try{    
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String turbinas = CampoA1.getText();
                    String trenAterrizaje = CampoA2.getText();
                    String suministros = CampoA4.getText();
                    String manifiesto = CampoA3.getText();
                    Carga car = new Carga(altitud, tripulacion, nombre, turbinas, trenAterrizaje, suministros, manifiesto);
                    hangar.registrar(car);
                    car.preparar();
                    car.preparar(3);
                    JOptionPane.showMessageDialog(null, "Agregado");  
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoA1.setText("");
                    CampoA2.setText("");
                    CampoA3.setText("");
                    CampoA4.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoA1.setVisible(false);
                    CampoA2.setVisible(false);
                    CampoA3.setVisible(false);
                    CampoA4.setVisible(false);               
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Etiqueta7.setVisible(false);  
                    Agregar3.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar4){
                try{                
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String turbinas = CampoA1.getText();
                    String trenAterrizaje = CampoA2.getText();
                    String dueno = CampoA3.getText();
                    String entretenimiento = CampoA4.getText();
                    Privado priv = new Privado(altitud, tripulacion, nombre, turbinas, trenAterrizaje, dueno, entretenimiento);
                    hangar.registrar(priv);
                    priv.preparar();
                    priv.preparar(4);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoA1.setText("");
                    CampoA2.setText("");
                    CampoA3.setText("");
                    CampoA4.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoA1.setVisible(false);
                    CampoA2.setVisible(false);
                    CampoA3.setVisible(false);
                    CampoA4.setVisible(false);               
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Etiqueta7.setVisible(false); 
                    Agregar4.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar5){
                try{   
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String helices = CampoH1.getText();
                    String armas = CampoH2.getText();                
                    int brigada = Integer.parseInt(CampoH3.getText());                   
                    MilitarH milih = new MilitarH(altitud, tripulacion, nombre, helices, armas, brigada);
                    hangar.registrar(milih);
                    milih.preparar();
                    milih.preparar(1);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoH1.setText("");
                    CampoH2.setText("");
                    CampoH3.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoH1.setVisible(false);
                    CampoH2.setVisible(false);
                    CampoH3.setVisible(false);
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Agregar5.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    CampoH3.setText("");
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar6){
                try{ 
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String helices = CampoH1.getText();
                    int hospital = Integer.parseInt(CampoH2.getText());                   
                    String equipo = CampoH3.getText();                
                    Rescate resc = new Rescate(altitud, tripulacion, nombre, helices, hospital, equipo);
                    hangar.registrar(resc);
                    resc.preparar();
                    resc.preparar(2);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoH1.setText("");
                    CampoH2.setText("");
                    CampoH3.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoH1.setVisible(false);
                    CampoH2.setVisible(false);
                    CampoH3.setVisible(false);
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Agregar6.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    CampoH2.setText("");
                    ex.printStackTrace();
                }   
            }else if(e.getSource() == Agregar7){
                try {   
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String helices = CampoH1.getText();
                    String heladeras = CampoH2.getText();
                    PrivadoH privH = new PrivadoH(altitud, tripulacion, nombre, helices, heladeras);
                    hangar.registrar(privH);
                    privH.preparar();
                    privH.preparar(3);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoH1.setText("");
                    CampoH2.setText("");                
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoH1.setVisible(false);
                    CampoH2.setVisible(false);
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);                
                    Agregar7.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");                    
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar8){
                try{
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String gas = CampoAr1.getText();
                    String timonel = CampoAr2.getText();
                    String empresa = CampoAr3.getText();
                    Dirigible dirig = new Dirigible(altitud, tripulacion, nombre, gas, timonel, empresa);
                    hangar.registrar(dirig);
                    dirig.preparar();
                    dirig.preparar(1);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoAr1.setText("");
                    CampoAr2.setText("");
                    CampoAr3.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoAr1.setVisible(false);
                    CampoAr2.setVisible(false);
                    CampoAr3.setVisible(false);
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Agregar8.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar9){
                try{
                    int altitud = Integer.parseInt(Campo1.getText());
                    int tripulacion = Integer.parseInt(Campo2.getText());
                    String nombre = Campo3.getText();
                    String gas = CampoAr1.getText();
                    String valvula = CampoAr2.getText();
                    int lastre = Integer.parseInt(CampoAr3.getText());
                    GloboAeros globo = new GloboAeros(altitud, tripulacion, nombre, gas, valvula, lastre);
                    hangar.registrar(globo);
                    globo.preparar();
                    globo.preparar(2);
                    JOptionPane.showMessageDialog(null, "Agregado"); 
                    Campo1.setText("");
                    Campo2.setText("");
                    Campo3.setText("");
                    CampoAr1.setText("");
                    CampoAr2.setText("");
                    CampoAr3.setText("");
                    Campo1.setVisible(false);
                    Campo2.setVisible(false);
                    Campo3.setVisible(false);
                    CampoAr1.setVisible(false);
                    CampoAr2.setVisible(false);
                    CampoAr3.setVisible(false);
                    Etiqueta1.setVisible(false);
                    Etiqueta2.setVisible(false);
                    Etiqueta3.setVisible(false);
                    Etiqueta4.setVisible(false);
                    Etiqueta5.setVisible(false);
                    Etiqueta6.setVisible(false);
                    Agregar9.setVisible(false);  
                    Agregar.setVisible(true);
                    ListGen.setVisible(true);
                    ListTec.setVisible(true);
                    Otros.setVisible(true);  
                    Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    CampoAr3.setText("");
                    ex.printStackTrace();
                }
            }else if(e.getSource() == Agregar10){
                try{
                int altitud = Integer.parseInt(Campo1.getText());
                int tripulacion = Integer.parseInt(Campo2.getText());
                String nombre = Campo3.getText();
                String propulsor = CampoC1.getText();
                Cohete ch = new Cohete(altitud, tripulacion, nombre, propulsor);
                hangar.registrar(ch);
                ch.preparar();
                ch.preparar(1);
                JOptionPane.showMessageDialog(null, "Agregado"); 
                Campo1.setText("");
                Campo2.setText("");
                Campo3.setText("");
                CampoC1.setText("");
                Campo1.setVisible(false);
                Campo2.setVisible(false);
                Campo3.setVisible(false);
                CampoC1.setVisible(false);
                Etiqueta1.setVisible(false);
                Etiqueta2.setVisible(false);
                Etiqueta3.setVisible(false);
                Etiqueta4.setVisible(false);
                Agregar10.setVisible(false);  
                Agregar.setVisible(true);
                ListGen.setVisible(true);
                ListTec.setVisible(true);
                Otros.setVisible(true);  
                Salir.setBounds(175, 270, 150, 30);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo convertir a entero");
                    Campo1.setText("");
                    Campo2.setText("");
                    ex.printStackTrace();
                }
            }

        
            //aqui se sigue poniendo 
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    /*------------------------------------------------ Funciones -------------------------------------------------------------------------------------------*/
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

    public static void listar() {
    //Uso de Try-catch
        try {
            int bandera = 0;
            for (Aeronave aeronave : hangar.getLista()) {
                //System.out.println(aeronave.general());
                JOptionPane.showMessageDialog(null, aeronave.general());
                bandera++;
            }
            if (bandera == 0){
                //System.out.println("No hay elementos registrados");
                JOptionPane.showMessageDialog(null, "No hay elementos registrados");
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            //System.out.println(e);
        }
    }
    
    public static void listarEsp() {
        try {
            int bandera = 0;
            for (Aeronave aeronave : hangar.getLista()) {                
                //System.out.println(aeronave.listarDatos());
                JOptionPane.showMessageDialog(null, aeronave.listarDatos());                                
                bandera++;
            }
            if (bandera == 0){
                System.out.println("No hay elementos registrados");
                JOptionPane.showMessageDialog(null, "No hay elementos registrados");
            }                
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
    }   
}