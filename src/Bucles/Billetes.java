package Bucles;

import java.util.Scanner;

public class Billetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int billetes500 = 0;
        int billetes200 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;

        System.out.println("introduce la cantidad: ");
        int cantidad = scanner.nextInt();
        if (cantidad % 5 == 0) {
            while (cantidad != 0) {
                if (cantidad >= 500) {
                    billetes500++;
                    cantidad -= 500;
                } else if (cantidad >= 200) {
                    billetes200++;
                    cantidad -= 200;
                } else if (cantidad >= 100) {
                    billetes100++;
                    cantidad -= 100;
                } else if (cantidad >= 50) {
                    billetes50++;
                    cantidad -= 50;
                } else if (cantidad >= 20) {
                    billetes20++;
                    cantidad -= 20;
                } else if (cantidad >= 10) {
                    billetes10++;
                    cantidad -= 10;
                } else if (cantidad >= 5) {
                    billetes5++;
                    cantidad -= 5;
                } else {
                    System.out.println("eres gilipollas si llegas aquí");
                }


            }
            System.out.println("Número de billetes de 500: " + billetes500);
            System.out.println("Número de billetes de 200: " + billetes200);
            System.out.println("Número de billetes de 100: " + billetes100);
            System.out.println("Número de billetes de 50: " + billetes50);
            System.out.println("Número de billetes de 20: " + billetes20);
            System.out.println("Número de billetes de 10: " + billetes10);
            System.out.println("Número de billetes de 5: " + billetes5);
        } else {
            System.out.println("introduce un número múltiplo de 5");
        }



    }
}
