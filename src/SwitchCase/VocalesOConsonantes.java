package SwitchCase;

import java.util.Scanner;

public class VocalesOConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "";

        System.out.println("Dime una letra y te diré si es una vocal o una consonante: ");
        String letraUsuario = scanner.nextLine();

        switch (letraUsuario){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letraUsuario + " es una vocal");
                break;
            default:
                System.out.println(letraUsuario + " es una consonante");
        }
    }
}
