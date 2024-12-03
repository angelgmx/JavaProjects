package Matrices;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //TODO: Pedir el numero de personas "n" a registrar
        //TODO: Crear una matriz llamada "personas"
        //TODO: Almacenar en "personas" el genero de cada persona (0 varon) (1 mujer) y el sueldo
        //TODO: calcular el sueldoMedio de los varones y mujeres
        Scanner scanner = new Scanner(System.in);


        System.out.print("Personas a registrar: ");
        int n = scanner.nextInt();

        int[][] empleados = new int[n][2];

        for (int i = 0; i < n; i++) {

            System.out.println("persona " + (i + 1));
            System.out.print("Genero (0-masculino) (1-femenino): ");
            empleados[i][0] = scanner.nextInt();

            System.out.print("salario: ");
            empleados[i][1] = scanner.nextInt();

        }

        int sueldoHombres = 0;
        int sueldoMujeres = 0;
        int contMujeres = 0;
        int conthombres = 0;

        for (int i = 0; i < n; i++) {
            if (empleados[i][0] == 0) { //hombre
                sueldoHombres += empleados[i][1];
                conthombres++;
            } else if (empleados[i][0] == 1) { //mujer
                sueldoMujeres += empleados[i][1];
                contMujeres++;
            }
        }

        int sueldoMedioHombres = sueldoHombres / conthombres;
        int sueldoMedioMujeres = sueldoMujeres / contMujeres;

        System.out.println("sueldo medio Hombres: " + sueldoMedioHombres);
        System.out.println("sueldo medio Mujeres " + sueldoMedioMujeres);

        if (sueldoMedioHombres > sueldoMedioMujeres){
            System.out.println("hay brecha salarial: los hombres ganan más.");
        } else if (sueldoMedioMujeres > sueldoMedioHombres) {
            System.out.println("hay brecha salarial: las mujeres ganan más.");
        } else
            System.out.println("No hay brecha salarial");

    }
}