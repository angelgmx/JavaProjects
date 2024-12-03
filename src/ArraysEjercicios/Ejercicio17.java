package ArraysEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[20];

        for (int i = 0; i < valores.length; i++) {

            System.out.println("Introduce 20 numeros");
            System.out.print("Numero " + (i + 1) + " :  ");
            valores[i] = scanner.nextInt();
            
        }

        int[] primeros = Arrays.copyOfRange(valores, 0, 10);
        int[] ultimos = Arrays.copyOfRange(valores, 10, 20);

        boolean sonIguales = Arrays.equals(primeros, ultimos);

        if (sonIguales){
            System.out.println("los arrays son iguales");
        } else {
            System.out.println("los arrays no son iguales");
        }

        System.out.println("Los primeros arrays son:  " + Arrays.toString(primeros));
        System.out.println("Los primeros arrays son:  " + Arrays.toString(ultimos));




    }
}
