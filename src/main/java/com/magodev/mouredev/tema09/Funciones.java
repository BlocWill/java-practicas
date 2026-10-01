package com.magodev.mouredev.tema09;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    public static void main(String[] args) {

        // Funciones

        //  funcion sin para metros ni retorno
        for(int index = 0; index < 5; index++) {
            sendEmail();
        }

        // .......

        sendEmail();

        // aunque tengo dos funciones llamadas igual no son la misma
        sendEmailToUser("wilson@gmail.com");
        sendEmailToUser("wilson@gmail.com", "Wilson");

        // creamos una variable para guardar una lista creada en base a un array
        var users = new ArrayList<>(Arrays.asList("barto@gmail.com", "nazareth@gmail.com", "adri@hotmail.com"));
        // llamado del metodo del array de emails
        sendEmailToUser(users);

        var state = sendEmailWhitState("maria@gmail.com"); // creamos la variable para guardar el dato retonado del boolean para usar
        System.out.println(state); // imprimiendo el dato

        System.out.println(sendEmailWhitState(""));
    }

    // Definicion de la funcion:
    // 1 public= para acceder desde cualquier parte de nuestro codigo
    // 2 Como estamos dentro de una funcion estatica, y aqui solo puedo llamar otras funciones estaticas
    // por eso el uso de la palabra static en esta funcion para poder ser llamdo
    // 3 que va a retornar como esta funcion no retorna nada se usa la palabra void= vacio
    // 4 nombre de la funcion

    public static void sendEmail() {
        System.out.println("Se envia el email");
    }

    // Funcion con parametros
    // Enviar un email a una persona en concreto
    public static void sendEmailToUser(String email) {
        System.out.println("Se envia el email a: " + email);
    }


    // Sobrecarga de funciones: reutilizar el mismo nombre y se sobrecarga con un comportamiento diferente
    // Funcion con varios paramtros
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envia el email a: " + email + " " + "Integrante: " + name);
    }


    // funcion con el mismo nombre y el mismo numero de parametros, aqui cambia el tipo de dato o la estructura de datos
    public static void sendEmailToUser(ArrayList<String> emails) {
        for(String email : emails) {
            System.out.println("Se envia el email a: " + email);
        }


    }

    // Funciones con retorno, ratornar si el email se ha enviado bien o mal

    // La sobrecarga de funciones NO funciona si cambiamos el tipo de retorno
    // La sobrecarga de funciones funciona con el mismo nombre y amedida que cambiamos los parametros
    // Pero no se puede hacer sobrecaga de funciones variando solo el tipo de dato que retorna
    public static boolean sendEmailWhitState(String email) {
        if(email.isEmpty()) {
            return false;
        }
        System.out.println("Se envia el email a: " + email);

        return true;
    }

}
