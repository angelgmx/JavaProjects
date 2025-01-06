package CadenaTextoStrings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una frase");
        String frase = scanner.nextLine().toLowerCase();

        //le "quito" espacios, o construyo una cadena sin espacios
        char[] arrayCaracteres = frase.toCharArray();
        String cadenaSinEspacios = "";

        for (int i = 0; i < arrayCaracteres.length; i++) {
            char caracter = arrayCaracteres[i];
            if (caracter != ' ') {
                cadenaSinEspacios += caracter;
            }
        }

        //TODO: copio el array de caracteres al revés

        char[] arrayInvertido = new char[arrayCaracteres.length]; //en este array vamos a copiar array caracteres

        for (int i = 0; i < arrayCaracteres.length; i++) {
            arrayInvertido[i] = arrayCaracteres[arrayCaracteres.length - 1 - i];
        }


        //TODO: comparo las cadenas, y si son iguales ignorando el caso, es palíndromo
        boolean esPalindromo = true;

        for (int i = 0; i < arrayCaracteres.length; i++) {
            if (arrayCaracteres[i] != arrayInvertido[i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La frase es un palídromo");
        } else {
            System.out.println("la frase no es un palíndormo");
        }
    }
}
