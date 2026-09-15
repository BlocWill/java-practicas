package com.magodev.mouredev.tema07;

public class Arrays {
    public static void main(String[] args) {

        // Declaracion y creacion
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Wilson", "Gonzalez", "magodev"};
        System.out.println(names);

        // Acceso
        System.out.println(names[1]);
        System.out.println(numbers[0]);

        // Creacion de un nuevo array de String(estamos creando tres espacio en memoria para cadenas de texto
        // aqui en resultado no vemos el espacio como 0 si no como null
        System.out.println((new String[3])[0]);

        // Modificacion : posivilidad de variar estos datos
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        // numbers[3] = 2; esto es un error el i 3 no a sido creado en este array numbers

        System.out.println(names[2]); // mostrando el valor del i 2 de array names
        names[2] = "wilson@gmail.com"; // modificamos el valor del i 2 del array names
        System.out.println(names[2]);

        // En los array NO existe la eliminacion, se puede hacer una especie de limpieza
        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length); // vemos que cambiamos un valor a null, pero la longitud no cambia

        // numbers[2] = null; Error el tipo de dato int es un dato primitivo y no es compatible con el valor
        // null, este solo se reserva o usa con los objetos String(cadenas de texto)

        // Array de booleans
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]); // boolean es otro tipo de dato primitivo pero este si inicializa false
    }
}
