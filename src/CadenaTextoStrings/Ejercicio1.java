package CadenaTextoStrings;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca una cadena de teto
        System.out.println("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        //Dividir el texto e palabras usando el metodo split
        String[] palabras = texto.split(" ");

        //Mostrar cada palabra en una linea distina
        System.out.println("Las palabras separadas son: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);

        }


    }
}
