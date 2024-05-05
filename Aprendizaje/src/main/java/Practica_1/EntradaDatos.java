package Practica_1;


import java.util.Scanner;

import static java.lang.System.out;

public class EntradaDatos {
    public static void main(String[] args) {

        Scanner Entrada =  new Scanner(System.in);
        String Datos;
        out.println("mostrar antes");
        Datos = Entrada.nextLine();
        out.println("Este es el texto ingresado por teclado: " + Datos);
    }
}
