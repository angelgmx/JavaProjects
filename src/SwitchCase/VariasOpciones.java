package SwitchCase;

import java.util.Scanner;

public class VariasOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Elige una opción (1-3)");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Hola " + nombre);
                break;
            case 2:
                System.out.println("Dime un número");
                int numeroUsuario = scanner.nextInt();
                if (numeroUsuario % 2 == 0) {
                    System.out.println("tu número " +numeroUsuario + " es par");
                } else
                    System.out.println("tu numero " + numeroUsuario + " no es par");
                break;
            case 3:
                System.out.println("Adios!");
                break;
            default:
                System.out.println("opción inválida");
        }

    }
}
