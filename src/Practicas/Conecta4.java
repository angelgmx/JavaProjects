package Practicas;

public class Conecta4 {
    public static void main(String[] args) {

        //Paso1: creamos la matriz que tiene 6 filas y 7 conlumnas
        char[][] tablero = new char[6][7];

        //Paso2: Inicializar el tablero con '.' para representar espacios vacios
        inicalizarTablero(tablero);

        //Paso3: mostrar el tablero
        mostrarTablero(tablero);
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
            System.out.print(i + " ");
        }
        System.out.println();
        //Mostrar el contenido del tablero
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("  "); //indentación para alinear los números
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

}

