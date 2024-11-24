package ArraysEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Random aleatorios = new Random();
        int[] numerosRandom = new int[100];

        for (int recorrido = 0; recorrido < numerosRandom.length; recorrido++) {
            numerosRandom[recorrido] = aleatorios.nextInt(1,10);
            System.out.println("Numero " + recorrido + ":" +numerosRandom[recorrido] );

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número y te diré en que posiciones aparece:  ");
        int numero = scanner.nextInt();


        for (int posiciones = 0; posiciones < numerosRandom.length; posiciones++) {
            if (numerosRandom[posiciones] == numero) {

            }
            System.out.print("[ " + posiciones + " ]");

        }
    }

}
