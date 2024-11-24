package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double total = 0;

        //declarar el Array
        double[] numeros = new double[10];

        //almacenar números en un array
        for (int num = 0; num < numeros.length; num++) {
            System.out.print("Dime un número " + (num +1) + " para hacer la suma total: ");
            numeros[num] = scanner.nextDouble();

            //suma de todos los valores
            total = total + numeros[num];
        }

        System.out.println("[" + total + "]");

    }
}
