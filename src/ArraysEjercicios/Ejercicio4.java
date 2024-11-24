package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int[] numero = new int[20];

        for (int almacenar = 0; almacenar < numero.length; almacenar++) {
            System.out.print("Numero " + almacenar + " : ");
            numero[almacenar] = scanner.nextInt();

            if (numero[almacenar] > 0){
                positivos ++;
            } else if (numero[almacenar] < 0) {
                negativos ++;
            }
        }

        System.out.println("positivos: " + positivos);
        System.out.println("negativos: " + negativos);

    }
}
