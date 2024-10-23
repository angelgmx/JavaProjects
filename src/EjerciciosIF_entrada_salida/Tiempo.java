package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la (HORAS) (MINUTOS) (SEGUNDOS)");
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();
        int segundos = scanner.nextInt();

        if ( horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("número introducido inválido");
        } else {
            if (segundos == 59) {
                segundos = 0;
                if (minutos == 59) {
                    minutos = 0;
                    if (horas == 23) {
                        horas = 0;
                    }else {
                        horas++;
                    }
                }else{
                    minutos++;
                }
            }else{
                segundos++;
            }
            System.out.println("la hora después de un segundo es: " + horas + ":" + minutos + ":" + segundos);
        }
    }
}
