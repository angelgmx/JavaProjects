package Bucles;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime un número base");
        long base = scanner.nextLong();
        System.out.println("dime el exponente");
        long exponente = scanner.nextLong();

        long potencia = 1;
        while (exponente > 0) {
            potencia = base * potencia;
            exponente--;
        }

        System.out.println("el resultado es: " + potencia) ;
    }
}
