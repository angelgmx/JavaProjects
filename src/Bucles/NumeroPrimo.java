package Bucles;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        int numUsuario;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número y te diré si es primo o no: ");
        numUsuario = scanner.nextInt();

        //validamos si es positivo
        if (numUsuario <= 1) {
            System.out.println("El número debe ser mayor a 1 para ser considerado positivo");
        } else {

            boolean esPrimo = false;
            for (int divisor = 2; divisor < numUsuario; divisor++) {
                    if (numUsuario % divisor == 0) {
                        esPrimo = true;
                    }

            }
            if (esPrimo) {
                System.out.println("El número: " + numUsuario + " no es primo");
            } else {
                System.out.println("El número: " + numUsuario + " es primo");
            }


        }

    }
}
