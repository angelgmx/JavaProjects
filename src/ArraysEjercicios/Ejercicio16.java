package ArraysEjercicios;

import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Creamos el array con el tamaño calculado
        int size = 0;
        for (int i = 0; i <= 10; i++) {
            size += i;
        }

        int[] valores = new int[size];

        int inicio = 0; // Índice para rastrear la posición en el array

        for (int i = 1; i <= 10; i++) {
            // Rellenamos la sección correspondiente con el número `i`
            Arrays.fill(valores, inicio, inicio +i, i );
            inicio += i;

        }

        System.out.println(Arrays.toString(valores));

    }

}
