// 9 Imprimir tres ejemplos de operadores unarios

package com.magodev.mouredev.tema04;

public class Ejercicio09 {
    public static void main(String[] args) {

        // Se incrementa el valor porque se hace el postincremento en una linea aparte
        var valor = 5;
        valor++;
        System.out.println(valor);

        // Aqui se tuvo que volver a imprimir valor ya que su postincremento no esta solo en la linea
        System.out.println(valor--);
        System.out.println(valor--);

        System.out.println(-valor);

    }
}
