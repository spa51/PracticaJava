package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class EstructuraCiclicaWhile {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int nroTablaMultiplicar =0;
        int i =0;
        out.println("Indicar nro. de Tabla de Multiplicar: ");
        nroTablaMultiplicar = Entrada.nextInt();

        while (i<=13){
            out.println(nroTablaMultiplicar + " X "  + i + " = " +(nroTablaMultiplicar*i));
            i++;
        }
    }
}
