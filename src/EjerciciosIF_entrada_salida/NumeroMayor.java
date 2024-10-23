package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime tres números y te diré cual es el mayor");

        byte num1 = scanner.nextByte();
        byte num2 = scanner.nextByte();
        byte num3 = scanner.nextByte();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else
            System.out.println("el mayor es el " + num3);
    }    
}
