import java.util.Scanner;

public class Fibonacci_bucles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime numero limite: ");
        int n = scanner.nextInt();

        int serie = 0; // contiene los números de la serie
        int a = 0; // contiene el número anteior
        int b = 1; //contiene el número anteior del anterior

        System.out.println(a);
        System.out.println(b);

        while (serie <= n) {
            serie = a + b;
            b = a;
            serie = b;
        }


    }
}
