package Practica_1;


import java.util.Scanner;

import static java.lang.System.out;

public class EntradaDatos {
    public static void main(String[] args) {

        Scanner Entrada =  new Scanner(System.in);
        String Nombre;
        String Profesion;
        int Edad;
        double Sueldo;

        out.println("Ingresa tu Nombre: ");
        Nombre = Entrada.nextLine();

        out.println("Ingresa tu Profesion: ");
        Profesion = Entrada.nextLine();

        out.println("Ingresa tu Edad");
        Edad = Entrada.nextInt();

        out.println("Ingresa tu Sueldo");
        Sueldo = Entrada.nextDouble();

        out.println("Hola " + Nombre+ " Tu profesion es "+ Profesion+" y tu Edad es "+Edad+" y tu sueldo es "+Sueldo);
    }
}
