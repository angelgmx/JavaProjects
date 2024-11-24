package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        double[] numero = new double[2];

        //pedimos 10 numeros y los almacenamos en un array

        for (int pedir = 0; pedir < numero.length; pedir++) {
            System.out.print("Dime el numero " + pedir + ": ");
            numero[pedir] = scanner.nextDouble();
        }

        //iniciamos el array con el primer valor del array
        max = numero[0];
        min = numero[0];

        //recorremos el array para encontrar el máximo y el mínimo
        for (int encontrar = 1; encontrar < numero.length; encontrar++) {
            if (numero[encontrar] > max) {
                max = numero[encontrar];
            } else if (numero[encontrar] < min) {
                min = numero[encontrar];
            }
        }

        System.out.println("maximo: " + max);
        System.out.println("minimo: " + min);

    }
}
