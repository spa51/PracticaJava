package Practica_1;

class Persona{
    String Nombre;
    int Edad;
    String Telefono;

    static void Saludo(String cNombre){
        System.out.println("Hola que tal "+cNombre);
    }

}

public class EjemplosClases {
    public static void main(String[] args) {
        Persona oPersona1 = new Persona();
        Persona oPersona2 = new Persona();

        oPersona1.Nombre = "Victor";
        oPersona1.Edad = 30;
        oPersona1.Telefono = "301202311";

        oPersona2.Nombre = "Camilo";
        oPersona2.Edad = 15;
        oPersona2.Telefono = "321312312";

        System.out.println(oPersona1.Nombre + " - "+ oPersona2.Nombre);

        Persona.Saludo(oPersona1.Nombre);


    }
}
