package Practica_1;

public class EjemplosMetodos {

    static  void Mensaje(String cTexto, String cNombre){
//        System.out.println("Hola mundo");
//        System.out.println("Mi Nombre es Santiago");
        System.out.println(cTexto);
        System.out.println(cNombre);
    }

    static int Sumar(int Valor1, int Valor2){
        return Valor1+Valor2;
    }
    public static void main(String[] args) {
//        Mensaje("Este es mi Primer metodo","Mi Nombre es Santiago");
        System.out.println("La suma es: "+ Sumar(2,4));
    }
}
