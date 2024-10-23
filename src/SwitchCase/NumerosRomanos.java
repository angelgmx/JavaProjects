package SwitchCase;

import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "";
        System.out.println("Dime un número entre (1-10) y te lo paso a números romanos: ");
        int numUsuario = scanner.nextInt();

        switch (numUsuario){
            case 1:
                texto= "I";
                break;
            case 2:
                texto= "II";
                break;
            case 3:
                texto= "III";
                break;
            case 4:
                texto= "IV";
                break;
            case 5:
                texto= "V";
                break;
            case 6:
                texto="VI";
                break;
            case 7:
                texto= "VII";
                break;
            case 8:
                texto= "VIII";
                break;
            case 9:
                texto= "IX";
                break;
            case 10:
                texto= "X";
                break;
            default:
                System.out.println("número fuera del rango");
        }
        System.out.println("tu numero en número romano es: " + texto);
    }
}
