package Bucles;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        int limiteInferior = 1;
        int limiteSuperior = 100;
        int numPropuesto;
        boolean encontrado = false;
        String respuesta;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Piensa un nº, y yo intento adivinarlo. ");
        System.out.println("Contesta con la palabra 'mayor', 'menor' o 'igual' ");

        while(encontrado == false) {

            numPropuesto = (limiteSuperior + limiteInferior) / 2;
            System.out.println("¿Tu número es el " + numPropuesto + "?");
            respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("mayor")) {
                limiteInferior = numPropuesto + 1;
            } else if (respuesta.equals("menor")) {
                limiteSuperior = numPropuesto - 1;
            } else {
                //que es igual
                encontrado = true;
                System.out.println("¡¡He adivinado el número!!");
            }
        }


    }
}