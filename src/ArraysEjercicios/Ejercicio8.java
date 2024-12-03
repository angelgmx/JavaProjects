package ArraysEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Random aleatorios = new Random();
        double[] numerosRandom = new double[100];
        for (int recorrido = 0; recorrido < numerosRandom.length; recorrido++) {
            numerosRandom[recorrido] = aleatorios.nextDouble(0.0, 1.0);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("dime un número y te diré el número de valores superiores o iguales: ");
        double numero = scanner.nextDouble();
        scanner.nextLine();

        //encontrar el número del usuario en el array
        int iguales = 0;
        for (int encontrar = 0; encontrar < numerosRandom.length ; encontrar++) {
            if ( numero <= numerosRandom[encontrar]) {
                iguales++;
            }
            System.out.println("numeroAleatorio " + encontrar + ": " + numerosRandom[encontrar]);
        }
        System.out.println("iguales: " + iguales);

    }
}
