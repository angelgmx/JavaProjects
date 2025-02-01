package Practicas;

import java.util.Scanner;

public class conecta4Juego {

    //Declaración de las variables generales
    public static final char FICHAHUMANO = 'X';
    public static final char FICHAMAQUINA = 'O';
    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;

    public static void main(String[] args) {
        mostrarMensajeBienvenida();
        System.out.println();
        char[][] tablero = new char[FILAS][COLUMNAS];
        //Paso2: Inicializar el tablero con '.' para representar espacios vacios
        inicalizarTablero(tablero);
        //Paso3: mostrar el tablero
        mostrarTablero(tablero);
         int columna = pedirColumna(tablero);


    }
    public static void mostrarMensajeBienvenida() {
        System.out.println("  ________      ________      ________       _______       ________      _________    ________          ___   ___      ");
        System.out.println(" |\\   ____\\    |\\   __  \\    |\\   ___  \\    |\\  ___ \\     |\\   ____\\    |\\___   ___\\ |\\   __  \\        |\\  \\ |\\  \\     ");
        System.out.println(" \\ \\  \\___|    \\ \\  \\|\\  \\   \\ \\  \\\\ \\  \\   \\ \\   __/|    \\ \\  \\___|    \\|___ \\  \\_| \\ \\  \\|\\  \\       \\ \\  \\\\_\\  \\    ");
        System.out.println("  \\ \\  \\        \\ \\  \\\\\\  \\   \\ \\  \\\\ \\  \\   \\ \\  \\_|/__   \\ \\  \\            \\ \\  \\   \\ \\   __  \\       \\ \\______  \\   ");
        System.out.println("   \\ \\  \\____    \\ \\  \\\\\\  \\   \\ \\  \\\\ \\  \\   \\ \\  \\_|\\ \\   \\ \\  \\____        \\ \\  \\   \\ \\  \\ \\  \\       \\|_____| \\  ");
        System.out.println("    \\ \\_______\\   \\ \\_______\\   \\ \\__\\\\ \\__\\   \\ \\_______\\   \\ \\_______\\       \\ \\__\\   \\ \\__\\ \\__\\             \\ \\__\\ ");
        System.out.println("     \\|_______|    \\|_______|    \\|__| \\|__|    \\|_______|    \\|_______|        \\|__|    \\|__|\\|__|              \\|__| ");
        System.out.println();
        System.out.println("     🎉 ¡BIENVENIDO A CONECTA 4! 🎉");
        System.out.println("  🔴 Juego clásico de estrategia 🟡 ");
        System.out.println("  🔵 Juega contra la máquina 🤖 ");
        System.out.println("  🏆 Consigue conectar 4 fichas seguidas!");
        System.out.println("  🚀 ¡Que gane el mejor! ");
    }


    //función para iniciar el tablero y lleva todas las posiciones con '.' que representa un espacio vacio.
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
            System.out.println("Elige un número del (1-7)");
            columnaElegida = scanner.nextInt();
        } while (!esColumnaValida(tablero, columnaElegida));
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

    public static int insertarFicha(char[][] tablero, int columna, char ficha) {

        int fila = tablero.length - 1; // la última fila del array y -1 para acceder a la posición de la última fila
        while (tablero[fila][columna] != '.') { //este bucle busca un espacio vacío (Mientras sea distinto de '.')
            fila--;
        }
        tablero[fila][columna - 1] = ficha;
        return fila;

    }

    public static int generarColumnaAleatoria(char[][] tablero) {
        int randomColumna;
        do {
          randomColumna = (int) (Math.random() * 1 + 7);
        } while (!esColumnaValida(tablero, randomColumna));
        return randomColumna;
    }

    /*
    Recorremos todas las columnas de la fila en la que ha caído la ficha, verificando si hay 4 fichas consecutivas del mismo jugador.
    - Si encontramos una ficha del jugador actual ('X' o 'O'), incrementamos el contador.
    - Si en la siguiente celda también está su ficha, seguimos sumando.
    - Si encontramos una ficha diferente o un espacio vacío ('.'), reiniciamos el contador a 0.
    - El bucle continúa hasta revisar todas las columnas de la fila.
    - Si en algún momento el contador llega a 4, el jugador gana la partida.
    */
    public static boolean ComprobarVictoria(char[][] tablero, int columna, int fila, char ficha) {

        int count = 0; //  Contador para fichas consecutivas

        // Verificar fila (horizontalmente)
        for (int i = 0; i < COLUMNAS; i++) {
            if (tablero[fila][i] == ficha){
                count++;
                if (count == 4){ // Si se encuentra 4 fichas consecutivas, victoria.
                    return true;
                }
            } else{
                count = 0; //Reiniciamos el contador si hay interrupción
            }
        }

        //Verificar columna (vertical)
        //Iterar la la fila para encontrar fichas consecutivas en la posición de la columna elegida
        count = 0; // Reiniciamos el contador
        for (int i = 0; i < FILAS; i++) {
            if (tablero[i][columna - 1] == ficha ){ // columna - 1 porque el usuario elige del 1 al 7
                count++;
                if (count == 4) return true;
            } else {
                count = 0; //
            }
        }

        return false; // si no hay victoria en ninguna dirección

    }
}

