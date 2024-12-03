package Matrices;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //TODO: crear una matriz de 4x5 (4)Alumnos y (5)Asignaturas.
        //TODO: introducir las notas y guardarlas en la matriz.
        //TODO: validar cual es la máxima, minima y media de cada alumno.
        Scanner scanner = new Scanner(System.in);
        final int NUM_ALUMNOS = 4;
        final int NUM_AIGNATURAS = 5;
        double[][] notas = new double[NUM_ALUMNOS][NUM_AIGNATURAS];

        System.out.println("Introduce las notas para cada alumno(0-10): ");
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
            System.out.println(" Alumno " + (alumno + 1) + " ");
            for (int asignatura = 0; asignatura < NUM_AIGNATURAS; asignatura++) {
                System.out.print(" Nota de la asignatura " + "["+ (asignatura + 1) + "]" +  ": ");
                notas[alumno][asignatura] = scanner.nextDouble();
            }
        }

        //recorrer las notas del alumno
        for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {

            double sumaNotas = 0;
            double notaMinima = notas[alumno][0];
            double notaMaxima = notas[alumno][0];

            for (int asignatura = 0; asignatura < NUM_AIGNATURAS; asignatura++) {
                double nota = notas[alumno][asignatura];
                sumaNotas += nota;

                if (nota < notaMinima){
                    notaMinima = nota;
                }
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
            }
            double notaMedia = sumaNotas / NUM_AIGNATURAS;

            System.out.println("Alumno " + (alumno + 1));
            System.out.println("NotaMinima: " + notaMinima);
            System.out.println("NotaMaxima: " + notaMaxima);
            System.out.println("Nota Media: " + notaMedia);

        }
    }
}
