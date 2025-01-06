/**
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y
 * dos apellidos. Luego mostrará un código de usuario (en mayúsculas)
 * formado por la concatenación de las tres primeras letras de cada uno de
 * ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará
 * “LIOTARALC”.
 */

package CadenaTextoStrings;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el nombre y los apellidos
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Introduce el segundo apellido: ");
        String apellido2 = scanner.nextLine();

        //tomas las tres primeras letras de cada cadena
        String codNombre = nombre.length() >= 3 ? nombre.substring(0, 3).toUpperCase() : nombre.toUpperCase();
        //                  condición ?                     valor si es verdadero      : valor si es falso;

        String codApellido1 = apellido1.length() >= 3 ? apellido1.substring(0, 3).toUpperCase() : apellido1.toUpperCase();
        String codApellido2 = apellido2.length() >= 3 ? apellido2.substring(0,3).toUpperCase() : apellido2.toUpperCase();

        //concatenarme el codigo del usuario generado
        String codUsuario = codNombre + codApellido1 + codApellido2;

        System.out.println("el codigo de usuario gnerado es: " + codUsuario);


    }
}
