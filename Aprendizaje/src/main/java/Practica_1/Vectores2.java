package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class Vectores2 {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int nCantidad=0;

        out.println("Ingrese la cantidad de notas: ");
        nCantidad = Entrada.nextInt();

        int [] Notas = new int[nCantidad];

        for (int i = 0; i < nCantidad; i++) {
            out.print("Ingresa la nota para la posicion #"+i+": ");
            Notas[i]=Entrada.nextInt();
            
        }
        out.println("Notas Ingresadas: ");
        for (int a = 0; a < nCantidad; a++) {
            out.println("Nota #"+a +": "+ Notas[a]);
        }
    }
}
