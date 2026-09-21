/* 10- Dado un Array transformarlo a un ArrayList, a continuacio en un Hashset y finalmente en un
Hashmap con clave y valor iguales
 */

package com.magodev.mouredev.tema07;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class Ejercicio10 {
    public static void main(String[] args) {

        String[] cars = {"Audi", "Mercedes Benz", "Ferrari", "McLaren", "Mercedes Benz" };

        // Para imprimir el contenido del Array
        System.out.println(Arrays.toString(cars));

        // Convirtiendo el Array en una lista para que ArrayList lo reciba como una collection
        System.out.println(Arrays.asList(cars));

        // Creando el ArrayList con su nombre usando los datos de la lista que convertimos anteriormente
        ArrayList<String> autos = new ArrayList<>(Arrays.asList(cars));
        System.out.println(autos);

        // Convirtiendo el ArrayList en un HashSet
        HashSet<String> automovil = new HashSet<>(autos);
        System.out.println(automovil);

        // Convertir el HashSet en un HashMap con clave y valor iguales
        HashMap<String, String> escuderias = new HashMap<>();

        // Con el forEach recorro el Set(automovil) ya que no tiene i uso el forEach y el recorrido lo guardo
        // En la variable temporal (auto) indicando el tipo de dato primero, y con put() agrego al Map(escuderias)
        // La clave y el valor
        for(String auto : automovil) {
            escuderias.put(auto, auto);
        }

        // Imprimiendo el HashMap(escuderias) con las claves y valores repetido
        System.out.println(escuderias);
    }
}
