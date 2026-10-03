// 10- crear una funcion que reciba un ArrayList<String> y lo recorra mostrando cada elemento

package com.magodev.mouredev.tema09;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {

         ArrayList<String> dulces = new ArrayList<>(Arrays.asList("Marquesa chocolate", "Brownie", "Tiramisu", "Quesillo"));

         postres(dulces);

    }

    public static void postres(ArrayList<String> dulces) {
       for(String dulce : dulces) {
           System.out.println(dulce);
       }

    }
}
