package SwitchCase;

import java.util.Scanner;

public class SwitchCaseEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String notaTexto = "";

        System.out.println("escribe una opción entre (1-3)");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                notaTexto = "opción 1";
                break;
            case 2:
                notaTexto = "opción 2";
                break;
            case 3:
                notaTexto = "opción 3";
                break;
            default:
                System.out.println("número no válido");
        }
        System.out.println(notaTexto);
    }
}
