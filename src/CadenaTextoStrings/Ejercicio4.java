package CadenaTextoStrings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una frase");
        String frase = scanner.nextLine();

        //Convertimos a minusculas toda la cadena, para evitar las mayusculas
        frase = frase.toLowerCase();

       char[] arrayCaracteres = frase.toCharArray(); //convertimos frase en un array de caracteres

        for (int i = 0; i < frase.length(); i++) {
            char caracter = arrayCaracteres[i];

            switch (caracter){
                case 'a' -> contadorA++;
                case 'e' -> contadorE++;
                case 'i' -> contadorI++;
                case 'o' -> contadorO++;
                case 'u' -> contadorU++;
            }
        }

        System.out.printf("Número de A's: %d \n", contadorA);
        System.out.printf("Número de E's: %d \n", contadorE);
        System.out.printf("Número de I's: %d \n", contadorI);
        System.out.printf("Número de O's: %d \n", contadorO);
        System.out.printf("Número de U's: %d \n", contadorU);

    }

}
