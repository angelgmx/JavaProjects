
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número límite para la serie: ");
        int limite = scanner.nextInt();

        System.out.print("Cuantos elementos desesas imprimir?: ");
        int n = scanner.nextInt();

        int[] serie = new int[n];

        System.out.print((serie[0] = 0) + " ");
        System.out.print((serie[1] = 1) + " ");

        for (int i = 2; i < n; i++) {
            serie[i] = (serie[i -1]) + (serie[i -2]);
            System.out.print(serie[i] + " ");

            if (serie[i] > limite) {
                break; // Salir del bucle si se supera el límite
            }



        }


    }
}
