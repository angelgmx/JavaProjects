package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("dime tu nombre: ");
        String nombreUsuario = leer.nextLine();

        System.out.println("Dime tu nota: ");
        double notaAlumno = leer.nextDouble();

        String notaTexto = "";

        System.out.println("Alumno: " + nombreUsuario + " ok tu nota es: " + notaAlumno);
        if (notaAlumno < 5) {
            notaTexto = "LAMENTABLE";
        } else if (notaAlumno <= 6) {
            notaTexto = "SUFICIENTE";
        } else if (notaAlumno <= 8) {
            notaTexto = "NOTABLE";
        } else if (notaAlumno <= 10) {
            notaTexto = "SOBRESALIENTE";
        }else{
            notaTexto = "ERROR";
        }
        System.out.println("tu nota es: " + notaTexto);
    }
}
