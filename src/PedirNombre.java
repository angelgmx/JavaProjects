import java.util.Scanner;

public class PedirNombre {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir el nombre ingresado
        System.out.println("¡Hola, " + nombre + "! Bienvenido/a.");

        // Cerrar el scanner
        scanner.close();

        System.out.println("Dime tu nombre");

    }
}
