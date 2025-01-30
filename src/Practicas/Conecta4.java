package Practicas;

import java.util.Scanner;

public class Conecta4 {
    // Declaraciones de constantes globales
    public static final char FICHAHUMANO = 'X';
    public static final char FICHAMAQUINA = 'O';
    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    public static void main(String[] args) {
        mostrarMensajeBienvenida(); // bienvenida del juego

        //Paso1: creamos la matriz que tiene 6 filas y 7 conlumnas
        char[][] tablero = new char[FILAS][COLUMNAS];
//        boolean ganador = true;

        //Paso2: Inicializar el tablero con '.' para representar espacios vacios
        inicalizarTablero(tablero);
        //Paso3: mostrar el tablero
        mostrarTablero(tablero);
        //Paso4: pedir ficha al jugador Humano
        while (true) {
            int colJugador =  pedirColumna(tablero);
            insertarFicha(tablero,colJugador,FICHAHUMANO);
            System.out.println("el tablero tras tu jugada");
            mostrarTablero(tablero);
            int colMaquina = generarJugada(tablero);
            insertarFicha(tablero,colMaquina,FICHAMAQUINA);
            System.out.println("el tablero tras la jugada de la CPU");
            mostrarTablero(tablero);
        }
    }
    public static void mostrarMensajeBienvenida() {
        System.out.println("********************************************");
        System.out.println("*            BIENVENIDO A CONECTA 4        *");
        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*  Objetivo:                               *");
        System.out.println("*  Consigue conectar 4 fichas en línea     *");
        System.out.println("*  (horizontal o vertical) antes que tu    *");
        System.out.println("*  oponente (la máquina). ¡Buena suerte!   *");
        System.out.println("*                                          *");
        System.out.println("********************************************");
        System.out.println();
    }

    //función para iniciar el tablero y lleba todas las posiciones con '.' que representa un espacio vacio
    public static void inicalizarTablero(char[][] tablero) {
        //recorremos todas las filas del tablero
        for (int i = 0; i < tablero.length; i++) {
            //recorremos las columnas de cada fila
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '.';
            }
        }

    }

    //función que imprime el estado actual del tablero en la consola
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

    public static int pedirColumna(char[][] tablero){
        Scanner scanner = new Scanner(System.in);
        int numColumna = -1;
        do {
            System.out.println("Donde quires insertar la ficha?: ");
            numColumna = scanner.nextInt();
            scanner.nextLine();
        } while (!validarColumna(tablero, numColumna));
        return numColumna;
    }

    public static int generarJugada(char[][] tablero){
        int randomColumna = -1;
        do {
            randomColumna = (int) (Math.random() * 7 + 1);
        } while (!validarColumna(tablero, randomColumna));
        return randomColumna;
    }

    public static boolean validarColumna(char[][] tablero, int numColumna){
        boolean validez = false;
        if (numColumna <= 7 && numColumna >= 1) {
            if (tablero[0][numColumna - 1] == '.') {
                validez = true;
            }
        }
        return validez;
    }

    public static void insertarFicha(char[][] tablero, int numColumna, char ficha){
        int altura = tablero.length - 1;
        while (tablero[altura][numColumna - 1] != '.'){
            altura--;
        }
        tablero[altura][numColumna - 1] = ficha;
    }
}

