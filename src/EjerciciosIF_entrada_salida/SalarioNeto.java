package EjerciciosIF_entrada_salida;

import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("numero de horas trabajadas en la semana: ");
        int horas = scanner.nextInt();
        System.out.println("introduce la tarifa por horas: ");
        int tarifaHora = scanner.nextInt();

        //calculo de salario bruto
        double salarioBruto;
        if (horas <= 35) {
            salarioBruto = horas * tarifaHora;
        } else {
            salarioBruto = 35 * tarifaHora + ((horas - 35) * tarifaHora * 1.5);
        }

        double impuestos;
        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <=900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }

        //salario neto
        double salarioNeto = salarioBruto - impuestos;

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("el salario neto: " + salarioNeto);
    }
}