package ARRAYS;

import java.util.Random;
import java.util.Scanner;

/**
 * un array donde esten almacenadadas las posiciones que ocupa el número pedido en el array original.
 * El array original se llamara "numerosAleatorios" y el array con las posiciones del numero se llamará "posiconesNumero"
 * EXPANSION: Reccorriendo el array posiciónNumero, mostrar el nº total de posiciones donde está el número pedido (es decir, en cuántas posiciones está)
 * EXPANSIÓN2: Mostrar cuál es la posicoión más alta donde figura el número pedido
 * EXPANSIÓN3: Almacenar las posiones donde figura el número pedido en un array de longitud
 * igual número total de posiciones
 */
public class PartiendodelEjercicio9 {

    public static void main(String[] args) {

        //TODO: crear un array que almacene números aleatorios
        final int posiciones = 100;
        Random aleatorios = new Random();
         int[] numerosAleatorios = new int[posiciones];
        for (int cont = 0; cont < numerosAleatorios.length; cont++) {
            numerosAleatorios[cont] = aleatorios.nextInt(1,10);
            System.out.println("posicion " + cont + ":" + numerosAleatorios[cont]);
        }

        //TODO: pedir un numero y mostrará en que posiciones aparecerá N
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime un número y te diré en que posiciones aparece: ");
        int numero = scanner.nextInt();
        for (int posicion = 0; posicion < numerosAleatorios.length; posicion++) {
            if (numero == numerosAleatorios[posicion]){
                System.out.print("[" + posicion + "]");
            }
        }

    }
}
