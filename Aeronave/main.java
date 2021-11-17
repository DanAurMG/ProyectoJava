package Aeronave;

import Aeronave.Hangar;

public class main {
    public static void main(String[] args) {
        Hangar hangar1 = new Hangar();
        System.out.println("Este es un programa que funciona como un CRUD para diferentes tipos de aeronaves");
        hangar1.menu();
        System.out.println("Hasta la vista");
    }
}
