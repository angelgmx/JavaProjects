package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicios10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Solicitar el número de personas
        System.out.println("¿Cuántas alturas quieres introducir?: ");
        int n = scanner.nextInt();

        // Crear un array para almacenar las alturas
        double[] alturas = new double[n];

        // Pedir las alturas al usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + " (en metros): ");
            alturas[i] = scanner.nextDouble();
            
        }

        //calcular la altura media, máxima y mínima
        double suma, maxima = alturas[0], minima = alturas[0];


    }
}
