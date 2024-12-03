package ArraysEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array (N): ");
        int N = scanner.nextInt();
        System.out.print("Introduce el valor a asignar a todas las posiciones (M): ");
        int M = scanner.nextInt();

        int[] array = new int[N];
        Arrays.fill(array, M);

        // Mostrar el array por pantalla
        System.out.println("El array resultante es: " + Arrays.toString(array));
    }
}