package com.company;



public class Main {

    public static void main(String[] args) {
        // Un bloque de código reutilizable
       /* String mensaje = saludar("Victor");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);*/
//        alerta(mensaje: "Mensaje de  prueba");

        //libreria math

       /* System.out.println(Math.PI);

        double num1 = 13.75;
        double num2 = 23.12;

        System.out.println(Math.ceil(num2));
        System.out.println(Math.ceil(num1));
        System.out.println(Math.sqrt(num2));*/

        String msj1 = "Adios!";
        String msj2 = "adios!";

        //longitud de cadenas
        System.out.println(msj1.length());
        //compara longitudes de cadenas
        System.out.println(msj1.compareTo(msj2));
        //compara dos cadenas
        System.out.println(msj1.equals(msj2));
        //compara dos cadenas e ignora  si la letra está en mayúsculas
        System.out.println(msj1.equalsIgnoreCase(msj2));
        //pasa toda la cadena a mayúsculas
        System.out.println(msj1.toUpperCase());


    }
    //retorno explicito

    //retorno String
    public static String saludar(String nombre) {
        return "Hola, cómo estás " + nombre;
    }

    //retorno numero
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    //funciones void. No devuelven un valor
    /*public static void alerta(String mensaje) {
        System.out.println( mensaje );
    }*/




}
