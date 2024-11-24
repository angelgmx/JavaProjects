package Entornos;

import java.util.Scanner;

public class Tecnicasdebugging {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // Verificar si el divisor es cero para evitar la excepción
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; // Alternativamente, podríamos lanzar una excepción personalizada aquí
        }
        return a / b;
    }

    // Método principal para probar las operaciones
    public static void main(String[] args) {
        Tecnicasdebugging calculator = new Tecnicasdebugging();

        int addition = calculator.add(5, 3); // Esperado: 8
        int subtraction = calculator.subtract(5, 3); // Esperado: 2
        int multiplication = calculator.multiply(5, 3); // Esperado: 15

        // Dividir con chequeo para evitar dividir por cero
        int division = calculator.divide(10, 0); // Ahora maneja el error de división por cero

        System.out.println("Suma: " + addition);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division); // Se imprime "0" o el valor manejado en la excepción
    }
}
