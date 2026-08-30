package com.magodev.mouredev.tema03;

public class ClaseTipoDatosPrimitivos {
    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myAge = 45;
        System.out.println(myAge);

        double myStature = 1.77;  // para usar con numeros con decimales, hay mas datos para trabajar con decimales
        System.out.println(myStature);

        // Otros tipos de datos para trabajar con numeros ( float, long, byte)

        char myChar = 'W';       // Este hace referencia a un solo caracter
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);


       /* Tipo de dato en tiempo de compilacion

       La forma facil que tenemos para saber un tipo de dato: es que sienpre trabajamos
       con objetos

       Todos los tipos de datos primitivos tenemos su equivalente en clase

        */
        String myString = "Hola Naza";
        System.out.println(myString.getClass().getSimpleName()); // myString es una clase
        // y es facil saber el tipo de dato si tenemos una clase


    }
}
