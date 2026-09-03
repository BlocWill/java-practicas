package com.magodev.mouredev.tema05;

public class ClaseString {
    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Wilson";
        var surname = new String("Gonzalez"); // aqui se esta redundando

        // Operaciones basicas

        // Concatenacion
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2)); // empieza en indice 2 hasta el final del String
        System.out.println(name.substring(1, 3)); // empieza en el i 1 hasta el 3, el ultimo i el 3 lo excluye

        // Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name); // aqui comprobamos que name no ha cambiado

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Wilson"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparacion
        System.out.println(name.equals("Wilson"));
        System.out.println(name.equals("wilson"));
        System.out.println(name.equalsIgnoreCase("wilson")); // para ignorar mayusculas y minusculas

        // == VS equals()
        var x = "Wilson";
        var y = "Wilson";
        var z = new String("Wilson");

        System.out.println(x == y);
        System.out.println(x == z); // false porque es otro objeto nuevo
        System.out.println(x.equals(z)); // ahora es true porque equals() compara contenido

        // Trim (elimina espacios en blanco adelante y al final)
        System.out.println(" Hola, me llamo Wilson ".trim()); // aqui elimino los espacios en blanco

        // Reemplazar caracteres
        System.out.println(" Hola, me llamo Nazareth ".replace(" ", ""));
        // aqui estamos reemplazando los espacion vacios por sin espacios hay que pasarle el caracter viejo a
        // reemplazar por el nuevo que queremos, en este ejemplo son los espacios.

        // Format (alternativa a la interpolacion)
        var age = 45;
        System.out.println(String.format("Hola, %s. Tengo %d", name, age));





    }
}
