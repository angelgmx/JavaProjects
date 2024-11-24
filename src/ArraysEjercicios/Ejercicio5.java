package ArraysEjercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[20];
        double suma = 0;
        for (int recorrer = 0; recorrer < numeros.length; recorrer++) {
            System.out.print("Dime un número: ");
            numeros[recorrer] = scanner.nextDouble();
            suma += numeros[recorrer];
        }

        //media
         double media = suma / numeros.length;

        //mostrar
        System.out.println("la media es: " + "( " + suma + " / " + numeros.length + " ) " + " = " + media );
    }
}
