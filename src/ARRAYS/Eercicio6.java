package ARRAYS;

import java.util.Scanner;

public class Eercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("que número quires imprimir: ");
        int numero = scanner.nextInt();

        System.out.print("cuantas veces quieres imprimir tu número:");
        int repetir = scanner.nextInt();

        int[] recorrer = new int[repetir];


        for (int cont = 1; cont < recorrer.length ; cont++) {
            System.out.println("numero: " + numero);
        }


    }
}
