package ArraysEjercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Crear un array para almacenar las puntuaciones de 8 jugadores
        Integer[] puntuaciones = new Integer[8];
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca las puntuaciones
        System.out.println("Introduce las puntuaciones de los 8 jugadores (entre 1000 y 2800):");
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            puntuaciones[i] = scanner.nextInt();

            // Validar que las puntuaciones estén en el rango correcto
            while (puntuaciones[i] < 1000 || puntuaciones[i] > 2800) {
                System.out.println("La puntuación debe estar entre 1000 y 2800. Intenta de nuevo.");
                System.out.print("Jugador " + (i + 1) + ": ");
                puntuaciones[i] = scanner.nextInt();
            }
        }

        // Ordenar las puntuaciones en orden descendente
        Arrays.sort(puntuaciones, Collections.reverseOrder());

        // Mostrar las puntuaciones ordenadas
        System.out.println("\nRanking de puntuaciones (de mayor a menor):");
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println((i + 1) + ". " + puntuaciones[i]);
        }
    }
}
