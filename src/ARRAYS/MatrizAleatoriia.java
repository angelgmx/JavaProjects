package ARRAYS;

import java.util.Arrays;
import java.util.Random;

public class MatrizAleatoriia {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int[][] array = new int[3][4];
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                array[filas][columnas]= aleatorios.nextInt(1,101);
            }

        }for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                System.out.print(array[filas][columnas] + " ");
            }
            System.out.println();
        }

    }
}