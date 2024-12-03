package ArraysEjercicios;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Crear un array de tamaño 30
        int[] array = new int[30];

        // Rellenar el array con valores aleatorios entre 0 y 9
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        System.out.println(Arrays.toString(array));

        // Ordenar el array
        Arrays.sort(array);

        // Mostrar el array ordenado
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(array));
    }
}
