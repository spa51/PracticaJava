package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class EstructuraCondicionalMetodo {

    static String EvaluarEdad(int xEdad){
        String cTexto="";
        if (xEdad<15 ) {
            cTexto="Eres un niño";
        }
        else if(xEdad<17){
            cTexto="Eres un joven";
        }
        else {
            cTexto="Eres un Adulto";
        }
        return cTexto;
    }
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        out.println("Ingresa tu edad: ");
        int nEdad=0;
        nEdad = Entrada.nextInt();
        out.println(EvaluarEdad(nEdad));

    }
}
