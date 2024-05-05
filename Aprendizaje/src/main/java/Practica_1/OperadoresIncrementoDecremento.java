package Practica_1;

import static java.lang.System.out;

public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {

        int Numero1, Numero2;
        Numero1 = 5;
        Numero2 = 5;

        Numero1++;
        Numero2--;

        out.println("Numero1 es = "+ Numero1 +" y numero2 es = "+Numero2);
        Numero1++;
        Numero2--;
        out.println("Numero1 es = "+ Numero1 +" y numero2 es = "+Numero2);

    }
}
