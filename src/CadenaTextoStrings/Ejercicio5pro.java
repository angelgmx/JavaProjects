package CadenaTextoStrings;

import java.util.Scanner;

public class Ejercicio5pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce una frase: ");
        String frase = scanner.nextLine();

        //eliminar espacios y convertir a minusculas
        frase = frase.replace(" ", "").toLowerCase(); //convertir a minusculas


        char[] arrayCaracteres = frase.toCharArray(); //convertimos String( que es una cadena) frase a un array de Char
        char[] arrayInverso = new char[arrayCaracteres.length]; // este es el array al que le vamos a pegar la frase

        for (int i = 0; i < arrayCaracteres.length; i++) {
            arrayInverso[i] = arrayCaracteres[arrayCaracteres.length -1 -1]; //desde la última posición del array restamos con el indice
        }

        //convertimos el array a una cadena
        String fraseInversa =  new String(arrayInverso);

        if (fraseInversa.equalsIgnoreCase(frase)){
            System.out.println("La frase es un palíndromo");
        } else{
            System.out.println("La frase no es un palíndromo");
        }
    }
}
