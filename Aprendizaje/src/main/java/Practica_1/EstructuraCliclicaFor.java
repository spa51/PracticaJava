package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class EstructuraCliclicaFor {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int nTabla = 0;
        out.println("Ingrese un Numero de Tabla de Multiplicar: ");
        nTabla = Entrada.nextInt();

        for (int i = 0; i <= 13; i++) {
            out.println(nTabla+ " X "+ i + " = " + (nTabla*i));
        }


    }
}
