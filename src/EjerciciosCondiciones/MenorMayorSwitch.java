package EjerciciosCondiciones;

import java.util.Scanner;

public class MenorMayorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("opción (1): Suma de dos números");
        System.out.println("opción (2): División de dos números");
        System.out.println("opción (3): Se mostrará el resultado de ese número elevado a ese mismo número");
        System.out.println("opción (4): Calcula la potencia");
        short opción = scanner.nextShort();

        switch (opción) {
            case 1:

                System.out.println("dime el primer número para sumar");
                int numUsuario = scanner.nextInt();
                System.out.println("dime el segundo número para sumar");
                int numUsuario2 = scanner.nextInt();
                int suma = numUsuario + numUsuario2;

                System.out.println("la suma de: " + numUsuario + " + " + numUsuario2 + " = " + suma);
            break;

            case 2:

                System.out.println("Dime el dividendo");
                numUsuario = scanner.nextInt();
                System.out.println("Dime el divisor");
                numUsuario2 = scanner.nextInt();

                if (numUsuario2 == 0 ){
                    System.out.println("ERROR");
                } else {
                    double division = numUsuario / numUsuario2;
                    System.out.println("la división de: " + numUsuario + " / " + numUsuario2 + " = " + division);
                }
            break;

            case 3:

                System.out.println("Dime el número y te diré su potencia");
                numUsuario = scanner.nextInt();
                double potencia = Math.pow(numUsuario, numUsuario);

                System.out.println("El resultado de " + numUsuario + " elevado a " + numUsuario + " es: " + potencia);
            break;

            case 4:

                System.out.print("Introduce la base: ");
                double base = scanner.nextDouble();

                System.out.print("Introduce el exponente: ");
                int exponente = scanner.nextInt();

                // Calcular el resultado según el valor del exponente
                if (exponente > 0) {
                    potencia = Math.pow(base, exponente);  // Si el exponente es positivo
                    System.out.println("Resultado: " + potencia);
                } else if (exponente == 0) {
                    potencia = 1;  // Si el exponente es 0
                    System.out.println("Resultado: " + potencia);
                } else {
                    potencia = 1 / Math.pow(base, -exponente);  // Si el exponente es negativo
                    System.out.println("Resultado: " + potencia);
                }

                break;


        }
    }
}
