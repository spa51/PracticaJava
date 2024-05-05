package Practica_1;

import static java.lang.System.out;

public class OperadorCondicional {
    public static void main(String[] args) {

        //exp1 ? exp2 : exp3

        int Numero1, Numero2;
        String Respuesta="";
        Numero2=5;
        Numero1=6;
        Respuesta = (Numero1>Numero2) ? "Es Mayor" : "Es menor";
        out.println(Respuesta);
    }
}
