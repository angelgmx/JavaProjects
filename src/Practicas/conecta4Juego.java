package Practicas;

import java.util.Scanner;

public class conecta4Juego {

    //Declaración de las variables generales

    public static final char FICHAHUMANO = 'X';
    public static final char FICHAMAQUINA = 'O';
    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;

    public static void main(String[] args) {
        char[][] tablero = new char[FILAS][COLUMNAS];
        //Paso2: Inicializar el tablero con '.' para representar espacios vacios
        inicalizarTablero(tablero);
        //Paso3: mostrar el tablero
        mostrarTablero(tablero);


    }

    //función para iniciar el tablero y lleba todas las posiciones con '.' que representa un espacio vacio.
    public static void inicalizarTablero(char[][] tablero) {
        //recorremos todas las filas del tablero
        for (int i = 0; i < tablero.length; i++) {
            //recorremos las columnas de cada fila
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '.';
            }
        }

    }

    //función que imprime el estado actual del tablero en la consola.
    public static void mostrarTablero(char[][] tablero) {

        //Mostrar encabezado con los números de las columnas
        System.out.print("  ");
        for (int i = 1; i <= tablero[0].length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //Mostrar el contenido del tablero
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("  "); //indentación para alinear los números
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }

    }

    //Función que pide un número de columna al usaurio hasta que sea válido.
    public static int pedirColumna(char[][] tablero) {

        Scanner scanner = new Scanner(System.in);
        int columnaElegida;

        do {
            System.out.print("En que columna quieres introducir la ficha?: ");
            columnaElegida = scanner.nextInt();
        } while (!esColumnaValida( tablero, columnaElegida));
        return columnaElegida;
    }

    //Función que  comprueba si una columna está dentro del rango válido y no está llena.
    public static boolean esColumnaValida(char[][] tablero, int columna) {

        boolean esValida = false;
        if (columna >= 1 && columna <= 7) {
            if (tablero[0][columna - 1] == '.') {
                esValida = true; // es valida la columna si cumple la condición
            }
        }
        return esValida;

    }

    public static int  insertarFicha(char[][] tablero, int columna, char ficha){

        int fila  = tablero.length -1; // la última fila del array y -1 para acceder a la posición de la última fila
        while (tablero[fila][columna] != '.'){ //este bucle busca un espacio vacío (Mientras sea distinto de '.')
            fila--;
        }
        tablero[fila][columna -1] = ficha;
        return fila;

    }

    public static int generarColumnaAleatoria(char[][] tablero){
        int randomColumna;
        do {
            randomColumna =  (int) (Math.random()*1+7);
        } while (!esColumnaValida( tablero, randomColumna));
        return randomColumna;
    }
    public static boolean ComprobarVictoria(char[][] tablero, int columna, int fila){
        boolean ganador = false;
        for (int filas = 0; filas < tablero.length; filas--) {
            if (tablero[filas][columna] == 'X') {
                ganador = true;
            }
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                if (tablero[filas][columnas] == 'O') {
                    ganador = true;
                }

                if (tablero[filas][columnas -1]  == 'O') {
                    ganador = true;
                }

            }

        }
        return  ganador;
    }

}


