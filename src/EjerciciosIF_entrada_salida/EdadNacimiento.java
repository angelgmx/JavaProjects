package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class EdadNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int añoActual = 2023;
       int mesActual = 10;
       int diaActual = 23;

        System.out.println("dime tu dia de nacimiento");
        int dia = scanner.nextInt();

        System.out.println("dime tu mes de nacimiento");
        int mes = scanner.nextInt();

        System.out.println("dime tu año de nacimiento");
        int año = scanner.nextInt();

        if (año <= añoActual && mes <= mesActual && dia <= diaActual){

            año = añoActual - año;
            mes = mesActual - mes;
            dia = diaActual - dia;

            if (añoActual > año)
        }

    }
}
