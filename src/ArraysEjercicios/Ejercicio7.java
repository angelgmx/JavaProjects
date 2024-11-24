package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("En que posición empieza el array?: ");
        int inicio = scanner.nextInt();


        System.out.print("en que posición finaliza el array?: ");
        int fin = scanner.nextInt();
        int[] ultimo = new int[fin];

        for (int recorrido = inicio; inicio < ultimo.length; recorrido++) {
            ultimo[recorrido] = recorrido;
            System.out.println("[ " + ultimo[recorrido] + " ]");
        }


    }
}
