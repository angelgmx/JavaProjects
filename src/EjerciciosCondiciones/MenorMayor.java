package EjerciciosCondiciones;

import java.util.Scanner;

public class MenorMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime 3 números seguidos aleatorios");
        int numUsuario1 = scanner.nextInt();
        int numUsuario2 = scanner.nextInt();
        int numUsuario3 = scanner.nextInt();

        int menor;
        int medio;
        int mayor;

        if (numUsuario1 >= numUsuario2 && numUsuario1 <= numUsuario3) {
             menor = numUsuario1;
            if (numUsuario2 <= numUsuario3) {
                medio = numUsuario2;
                mayor = numUsuario3;
            } else {
                medio = numUsuario3;
                mayor = numUsuario2;
            }

        } else if (numUsuario2 <= numUsuario1 && numUsuario2 <= numUsuario3) {
            menor = numUsuario2;
            if ( numUsuario1 <= numUsuario3) {
                medio = numUsuario1;
                mayor = numUsuario3;
            } else {
                medio = numUsuario3;
                mayor = numUsuario2;
            }

        } else {
            menor = numUsuario3;
            if (numUsuario1 <= numUsuario2) {
                medio = numUsuario1;
                mayor = numUsuario2;
            } else {
                medio = numUsuario2;
                mayor = numUsuario1;

            }
        }
        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);

    }
}