package ARRAYS;

import java.util.Scanner;

/*Crea un programa que pida veinte números reales por teclado, los
almacene en un array y luego lo recorra para calcular y mostrar la media:
        (suma de valores) / nº de valores. */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[20];
        double suma = 0;

        // Pedir los 20 números y almacenarlos en el array
        System.out.println("introduce 20 números reales");

        for (int i = 0; i < 20; i++) {
            System.out.print("Número: " + (i + 1)  + ": ");
            numeros[i] = scanner.nextDouble(); // Leer cada número y almacenarlo
            suma += numeros[i]; // Sumar el número a la suma total
        }

        double media = suma / numeros.length;
        System.out.println("La media de los números ingresados es: " + media);
    }
}


