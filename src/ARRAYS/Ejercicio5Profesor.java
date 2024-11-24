package ARRAYS;

import java.util.Scanner;

public class Ejercicio5Profesor {
    public static void main(String[] args) {

        //definir maximo de numeros
        final int totalNumeros = 20;
        Scanner teclado = new Scanner(System.in);

        final double[] numeros = new double[totalNumeros];

        //solicitar X numeros REALES y almacenarlos en un array
        for (int posicion = 0; posicion < numeros.length; posicion++) {
            System.out.println("Dime el numero " + (posicion+1));
            double numero = teclado.nextDouble();
            numeros[posicion] = numero;
        }

        //recorrer el array y calcular la media
        double sumaTotal = 0;
        for(int cont = 0; cont < numeros.length; cont++){
            sumaTotal += numeros[cont];
        }

        //mostrar la media
        System.out.println("La media de números es: = " + (sumaTotal / totalNumeros));
    }
}
