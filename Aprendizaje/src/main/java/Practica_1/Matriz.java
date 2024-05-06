package Practica_1;

public class Matriz {
    public static void main(String[] args) {

        String [][] Personas = new String[4][3];

        Personas[0][0] ="Santiago";
        Personas[0][1] ="Piñerez";
        Personas[0][2] ="Arroyave";

        Personas[1][0] ="Carlos";
        Personas[1][1] ="Arias";
        Personas[1][2] ="Perez";

        Personas[2][0] ="Juan";
        Personas[2][1] ="ibañez";
        Personas[2][2] ="Correa";

        Personas[3][0] ="Ana";
        Personas[3][1] ="Care";
        Personas[3][2] ="rolo";

        for (int a = 0; a <=3; a++) {
            for (int i = 0; i <= 2; i++) {
                System.out.println(Personas[a][i]);
            }
            System.out.println("------");
        }

    }
}
