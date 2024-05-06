package Practica_1;

import java.util.Scanner;

import static java.lang.System.out;

public class TrabajandoConSwitch {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int nDia=0;
        String cResultado="";
        out.println("Ingresa el numero de dia de la semana: ");
        nDia = Entrada.nextInt();

        switch (nDia){
            case 1:
                cResultado="Lunes";
                break;

            case 2:
                cResultado="Martes";
                break;

            case 3:
                cResultado="Miercoles";
                break;

            case 4:
                cResultado="Jueves";
                break;

            case 5:
                cResultado="Viernes";
                break;

            case 6:
                cResultado="Sabado";
                break;

            case 7:
                cResultado="Domingo";
                break;
            default:
                cResultado="Numero de dia No valido";
        }
        out.println("El dia de la semana es: "+cResultado);

    }
}
