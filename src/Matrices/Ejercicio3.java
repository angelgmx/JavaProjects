package Matrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //TODO: crear una matriz de NxM
        //TODO: verificar cuantos valores son mayores que 0, menores que 0 y igual a 0

        int mayorCero = 0;
        int menorCero = 0;
        int igualCero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el número de las filas: ");
        int n = scanner.nextInt();
        System.out.print("Dime el número de columnas: ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        System.out.println("introduce los valores de la matriz:");
        for (int filas = 0; filas < n; filas++) {
            for (int columnas = 0; columnas < m; columnas++) {
                System.out.print("matriz " + "[" + filas + "]" + "[" + columnas + "]: ");
                matriz[filas][columnas] = scanner.nextInt();
            }
        }

        //mostrar matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t"); // Usamos "\t" para alinear columnas
            }
            System.out.println(); // Salto de línea para separar las filas
        }

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (matriz[filas][columnas] == 0) {
                    igualCero++;
                } else if (matriz[filas][columnas] < 0) {
                    menorCero++;
                } else {
                    mayorCero++;
                }
            }

        }

        System.out.println("mayores que 0: " + mayorCero);
        System.out.println("menores que 0: " + menorCero);
        System.out.println("Iguales que 0: " + igualCero);

    }
}
