package Matrices;

public class Ejercicio2 {
    public static void main(String[] args) {
        //TODO: CREAR UNA MATRIZ DE 10x10
        //TODO: GUARDAR LOS VALORES DE LA TABLA DE MULTIPLICAR EN UNA FILA
        //TODO: MOSTRAR LA MATRIZ POR PANTALLA

        int[][] tablas = new int[10][10];
        for (int filas = 0; filas < tablas.length; filas++) {
            for (int colunmas = 0; colunmas < tablas[filas].length; colunmas++) {
                tablas[filas][colunmas] = (filas + 1) * (colunmas + 1);
            }

        }

        for (int filas = 0; filas < tablas.length; filas++) {
            for (int columnas = 0; columnas < tablas.length; columnas++) {

                System.out.printf("%5d", tablas[filas][columnas]); // Espaciado para alinear columnas
            }
            System.out.println(); // Salto de línea para cada fila

        }
    }
}
