package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int[] aleatorio = new int[1000];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 100);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("**Se han generado 100 números aleatorios de 0 a 99");
        System.out.print("Dime un número y te diré si existe y cuantas veces se repite: " );
        int n = scanner.nextInt();
        int contador = 0;

        for (int encontrar = 0; encontrar < aleatorio.length; encontrar++) {

            if (aleatorio[encontrar] == n){
                contador += 1;

            }


        }

        if (contador > 0) {
            System.out.println("El número " + n + " existe en el array y aparece " + contador + " veces.");
        } else {
            System.out.println("El número " + n + " no se encuentra en el array.");
        }



    }
}
