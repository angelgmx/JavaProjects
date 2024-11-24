package ARRAYS;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReales=0;
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("dime un número REAL: ");
            nums[i] = scanner.nextDouble();
        }
        for (int i = 0; i < nums.length; i++) {
            totalReales += nums[i];
        }
        //mostrar

        System.out.println( "suma es " + totalReales);


    }
}
