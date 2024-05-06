package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class EstructuraCondicional {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        out.println("Ingresa tu edad: ");
        int nEdad=0;
        nEdad = Entrada.nextInt();

        if (nEdad<15 ) {
            out.println("Eres un niño");
        }
        else if(nEdad<17){
            out.println("Eres un joven");
        }
        else {
            out.println("Eres un Adulto");
        }
    }
}
