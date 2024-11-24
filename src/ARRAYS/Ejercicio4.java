package ARRAYS;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positivos = 0;
        double negativos = 0;
        double[] nums = new double[20];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("dime un número entero : ");
            nums[i] = scanner.nextDouble();
            if ( nums[i] >= 0) {
                positivos += nums[i];
            } else if (nums[i] < 0) {
                negativos -= nums[i];
            }
        }
        System.out.println("suma de los positivos es: " + positivos);
        System.out.println("suma de los positivos es: " + negativos);
    }
}
