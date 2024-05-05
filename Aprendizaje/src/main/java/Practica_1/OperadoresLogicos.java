package Practica_1;

import static java.lang.System.out;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int Numero1, Numero2;

        Numero1 = 10;
        Numero2 = 15;

        // "&& = and", "|| = or", "! = Not"
        boolean Resultado = !(5 == 5 && 6 == 6);
        out.println(Resultado);
    }
}
