// 8- Usar un continue para saltar los multiplos de 3 del 1 al 20

package com.magodev.mouredev.tema08;

public class Ejercicio08 {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
