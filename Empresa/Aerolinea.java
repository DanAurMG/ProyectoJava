package Empresa;

import java.util.Scanner;

public class Aerolinea {
    private static Scanner scanner;
    public static void main (String[] args){
        scanner = new Scanner(System.in);
        int op = 0;
        String header = "seleccione la opcion correspondiente";
        while (op != 5) {
            Limpiar();
            System.out.println(header);
            System.out.println("1: Agregar Vuelos");
            System.out.println("2: Vender Vuelos");
            System.out.println("3: ");
        }
    }
    public static void Limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
