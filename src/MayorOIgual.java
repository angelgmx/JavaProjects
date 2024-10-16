import java.util.Scanner;

public class MayorOIgual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escribe dos números y te diré cual es mayor o si son iguales");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1 > num2){
            System.out.println("El número mayor es " +num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es " +num2);
        } else {
            System.out.println("Son Iguales");
        }
    }
}
