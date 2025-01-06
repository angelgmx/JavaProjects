package CadenaTextoStrings;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        //primera cadena de texto:
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce una cadena de texto: ");
        //Segunda cadena de texto
        String cadena2 = scanner.nextLine();

        //comprar si las cadenas son iguales
        boolean sonIguales = cadena1.equals(cadena2);

        //comprar ignorando Mayusculas y Minusculas
        boolean igualesSinMaysculas = cadena1.equalsIgnoreCase(cadena2);

        //mostrar
        System.out.println("¿Son exactamente iguales? " + (sonIguales ? "SI": "NO"));
        System.out.println("Son iguales sin diferenciar minusculas y mayusculas " + (igualesSinMaysculas ? "SI" : "NO"));

    }
}
