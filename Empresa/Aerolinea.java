package Empresa;

import java.util.Scanner;

public class Aerolinea {
    private static Scanner entrada;
    public static void main (String[] args){
        entrada = new Scanner(System.in);
        int op = 0;
        String cabecera = "Seleccione la opcion correspondiente";
        while (op != 4) {
            Limpiar();
            System.out.println(cabecera);
            System.out.println("1: Ruteo");
            System.out.println("2: Vender Vuelos");
            System.out.println("3: Aviones");
            System.out.println("4: salir");
            op = entrada.nextInt();
            Limpiar();
            System.out.println("\n");
            
            switch(op){
                case 1 ->  Ruteo();
                case 2 ->  RealizarVenta();
                case 3 ->  Aviones();
                case 4 ->  System.out.println("Hasta pronto");
                default -> System.out.println();
            }
        }
    }

    public static void Limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Ruteo(){

    }

    public static void RealizarVenta(){
        int cantidad = 0;
        System.out.println("Ingrese la cantidad de vuelos deseada");
        cantidad = entrada.nextInt();
        Vuelos.Vender(cantidad);
    }

    public static void Aviones(){

    }
}
