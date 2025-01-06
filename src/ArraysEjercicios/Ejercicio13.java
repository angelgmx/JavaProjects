package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el valor inicial de la secuencia: ");
        int v = scanner.nextInt();

        System.out.print("Dime el incremento de la secuencia: ");
        int incremento = scanner.nextInt();

        System.out.print("numero de valores a crear: ");
        int n = scanner.nextInt();

        int[] secuencia = new int[n];

        int valor = v;

        for (int indice = v; indice < n; indice++) {

            valor += incremento;
            System.out.print(secuencia[indice] + " ");
            secuencia[indice] = valor;
        }

    }
}
