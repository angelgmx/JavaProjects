package Bucles;

import java.util.Scanner;

public class ContadorMultiplos3 {
    public static void main(String[] args) {

        int limiteUsuario;
        int multiplostres = 0;
       Scanner scanner = new Scanner(System.in);
       //Solicito el número al usuario
        System.out.println("Dime un número");
        limiteUsuario = scanner.nextInt();

        //contador hasta el número del usuario
        for (int contador = 1; contador <= limiteUsuario ; contador++) {

            if (contador % 3 == 0) {
                multiplostres++;
            }
        }
        System.out.println("número de múltiplos de 3: " + multiplostres);
    }
}
