package Matrices;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        // Declarar la matriz de tamaño 5x5
        int[][] matriz = new int[5][5];

        // Variable para llenar los números del 1 al 25
        int numero = 1;

        // Llenar la matriz con los números del 1 al 25
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                matriz[filas][columnas] = numero;
                numero++;
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz 5x5 con números del 1 al 25:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); // Tabulación para mejor formato
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }



}
