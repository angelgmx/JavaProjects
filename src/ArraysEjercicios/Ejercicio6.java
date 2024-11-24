package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime el tamaño del array: ");
         int tamaño = scanner.nextInt();
        int[] array = new int[tamaño];

        System.out.print("¿que valor quieres escribir en las posicones del array?");
        int numero = scanner.nextInt();


        for (int posiciones = 0; posiciones < array.length; posiciones++) {
            array[posiciones] = numero;
            System.out.print("[ " + array[posiciones] + " ]");
        }
    }
}
