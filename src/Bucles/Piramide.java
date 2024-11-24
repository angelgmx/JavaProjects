package Bucles;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int bloques = 1;

        System.out.print("dime el número de filas: ");
        int numFilas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("que quieres escribir: ");
        String bloque = scanner.nextLine();
        int longbloque = bloque.length();
        int espacio = numFilas * longbloque - longbloque;

        for (int i = 0; i < numFilas ; i++) {
            int espacioActual = espacio;
            while ( espacioActual > 0){
                System.out.print(" ");
                espacioActual--;
            }
            int bloquesActuales = bloques;
            while (bloquesActuales > 0) {
                System.out.print(bloque);
                bloquesActuales--;
            }
            espacio-=longbloque;
            bloques +=2;
            System.out.println();
        }
    }
}