package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        //almacenar números en un array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un número para almacenarlo en el array: ");
            numeros[i] = scanner.nextInt();
        }

        //recorrer el array para mostrar su contenido
        for (int mostrar = 0; mostrar < numeros.length; mostrar++) {
            System.out.println("[" + numeros[mostrar] + "]");
        }
    }



}
