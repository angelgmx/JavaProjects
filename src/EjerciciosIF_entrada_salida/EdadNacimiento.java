package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class EdadNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int anoActual = 2024;
       int mesActual = 10;
       int diaActual = 23;
       int edad;

        System.out.println("dime tu dia de nacimiento");
        int diaNacimietno = scanner.nextInt();

        System.out.println("dime tu mes de nacimiento");
        int mesNacimiento = scanner.nextInt();

        System.out.println("dime tu año de nacimiento");
        int anoNacimiento = scanner.nextInt();

        edad = anoActual - anoNacimiento;
        if (anoNacimiento > anoActual) {
            System.out.println("ERROR");
        } else if ( mesActual < mesNacimiento || diaActual < diaNacimietno && mesNacimiento == mesActual ) {
                edad--;
            System.out.println("tu edad es: " + edad);
        } else {
            System.out.println("tu edad es: " + edad);
        }
    }
}
