package ARRAYS;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("dime un número REAL: ");
            nums[i] = scanner.nextDouble();
            if( i == 0){
                max = nums[i];
                min = nums[i];
            }else if( nums[i] > max){
                max = nums[i];
            } else if ( nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("el mayor es: " + max);
        System.out.println("el menor es: " + min);

    }
}
