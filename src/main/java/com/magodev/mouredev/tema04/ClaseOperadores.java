package com.magodev.mouredev.tema04;

public class ClaseOperadores {
    public static void main(String[] args) {

        // Operadores

        // Aritmeticos

        var a = 5; // si quiero que me de un resultado con decimal una de las variables la uso con double
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asignacion

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparacion (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Logicos (Convinar expresiones booleanas)

        // Y (AND)

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // Los operadores logicos los usamos para revisar expresiones que esten expresando una condicion

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)

        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NO (NOT, NEGACION)

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b); // aqui el resultado es 5 la b que valia cuatro  se auto incremento despues de imprimirse
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        b++; // aqui daria igual si coloco (++b) porque esta en una linea separada
        System.out.println(b);





    }
}
