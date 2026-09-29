package com.magodev.mouredev.tema08;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;



public class Loops {
    public static void main(String[] args) {

        // Loops = nos sirve para repetir ejecuciones, ejecutamos un mismo bloque de codigo varias veces


        // for() controlado por contador
        for(int index = 0; index < 5; index++) {
            System.out.println("Naza dulceria"); // Este es el codigo que se va repetir 5 veces
        }


        // Como recorrer el tamaño de un Array y este Array puede crecer
        String[] cakes = {"Tres leche", "Tiramisu", "Brownie", "Marquesa de parchita", "Brazo gitano"};

        for(int index = 0; index< cakes.length; index++) {
            System.out.println(cakes[index]);
        }


        // for-each
        for(String cake: cakes) {
            System.out.println(cake);
        }

        // for-each en un HashSet
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer number : numbers) {
            System.out.println(number);
        }


        // for-each en un HashMap usando entrySet para convertir el mapa en un set y recorrerlos key-value
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Wilson", "wilson@gmail.com");
        emails.put("Gonzalez", "gonzalez@gmail.com");
        emails.put("Magodev", "magodev@gmail.com");

        for(Map.Entry<String, String> email : emails.entrySet()) {
            System.out.println(email);
            System.out.println(email.getKey()); // para ver las claves unicamente
            System.out.println(email.getValue()); // para ver los valores unicamente
        }


        // -while
        // Con este bucle repetimos si la condicion es verdadera no hace falta montar un contador
        // aqui estoy repitiendo algo segun la condicion del contador
        int index = 0;
        while (index < 5) {
            System.out.println("Hola Naza");
            index++;
        }


        // -while en un Array (inicializamos y declaramos un nuevo index, el index anterior quedo valiendo 5)
        String[] names = {"Wilson", "Gonzalez", "magodev"};
        index = 0;
        while(index < names.length) {
            System.out.println(names[index]);
            index++;
        }


        // -while donde el codigo se ejecuta en el momento que encuentre que el nombre es "Wilson"
        // aqui el criterio es que se a encontrado algo no solo el contador
        index = 0;
        while(index < names.length) {
            System.out.println(names[index]);
            if (names[index].equals("Wilson")) {
                index += 2;
            }
            index++;
        }



        // -while donde indicamos la condicion que queremos(al cambiar el boolean el while se rompe)
        index = 0;
        boolean find = false;
        while(!find) {
            System.out.println(names[index]);
            if (names[index].equals("Wilson")) {
                find = true;
            }
            index++;
        }



        // do-while: se va a ejecuta por lo menos la primera vez siempre
        index = 0;
        do {
            System.out.println("Hola Adriana");
            index++;

        } while (index < 5);



        //--------------- Control de bucles ---------------

        // - break:
        // Se rompe el bucle, se sale del bucle su sentencia

        for(String cake: cakes) {
            if (cake.equals("Tiramisu")) {
                break; // salgo del bucle
            }
            System.out.println(cake);
        }

        // - continue

        for(int idx= 0; idx < 5; idx++) {
            System.out.println(idx); // result: del 0 al 4 sin continue

        }
        // con continue
        for(int idx= 0; idx < 5; idx++) {
            if (idx == 3) {
                continue;
            }
            System.out.println(idx); // result: me salto el numero 3 continuo a la siguiente
        }







    }
}
