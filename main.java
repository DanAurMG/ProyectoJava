import javax.swing.JOptionPane;

import Aeronave.Hangar;

public class main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Este es un programa que funciona para registrar y consultar en un catalogo de aeronaves");
        Hangar hangar1 = new Hangar();
        hangar1.setBounds(0, 0, 500, 500);
        hangar1.setVisible(true);
        hangar1.setLocationRelativeTo(null);
        System.out.println("Este es un programa que funciona como un CRUD para diferentes tipos de aeronaves");
        //hangar1.menu();
        //System.out.println("Hasta la vista");
    }
}
