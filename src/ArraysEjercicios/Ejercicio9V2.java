package ArraysEjercicios;

import java.util.Random;
import java.util.Scanner;
/**Partiendo del Ejercicio9 proporcionado, queremos tener en última instancia un array donde estén almacenadas las posiciones que ocupa el número pedido en el array original. El array original se llamara "numerosAleatorios" y el array con las posiciones del numero se llamara "posicionesNumero"
 * Por defecto el array "posicionesNumero" tendrá todos sus valores a -1
 * EXPANSION1: Recorriendo el array posicionesNumero, mostrar el nº total de posiciones donde está el número pedido (es decir, en cuántas posiciones está)
 * EXPANSION2: Mostrar cuál es la posición más alta donde figura el número pedido
 * EXPANSIÓN3: Almacenar las posiciones donde figura el número pedido en un array de longitu
 * d igual al número total de posiciones
 */
public class Ejercicio9V2 {
    public static void main(String[] args) {

        Random random = new Random();
        final int TOTAL_NUMEROS = 50;
        int[] numerosAleatorios = new int[TOTAL_NUMEROS];

        for (int recorrido = 0; recorrido < numerosAleatorios.length; recorrido++) {
            numerosAleatorios[recorrido] = random.nextInt(1, 11);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número y te diré en que posición aparece: ");
        int n = scanner.nextInt();

        //crear array "posicionesNumero con todos sus valores en -1
        int[] posicionesNumero = new int[TOTAL_NUMEROS];
        for (int i = 0; i < posicionesNumero.length; i++) {
            posicionesNumero[i] = -1;
        }

        int contador = 0; // Contador para saber cuantas veces aparece n
        for (int indice = 0; indice < posicionesNumero.length; indice++) {
            if (numerosAleatorios[indice] == n) {
                posicionesNumero[contador] = indice; // guardar la posición de n en el array posicionesNumero
                contador++; //incrementamos el contador para guardar la siguiente posición de n
            }
        }

            // EXPANSION 1: Mostrar el número total de posiciones donde está el número pedido
            System.out.println("El número " + n + " aparece " + contador + " veces en el array");

            // EXPANSION 2: Encontrar y mostrar la posición más alta donde figura el número pedido
            if (contador > 0) {
                int posicionMasAlta = posicionesNumero[0];
                for (int i = 0; i < contador; i++) {
                    if (posicionesNumero[i] > posicionMasAlta){
                        posicionMasAlta = posicionesNumero[i];
                    }
                }
                System.out.println("La posición más alta donde figura el número es: " + posicionMasAlta);

            } else {
                System.out.println("El número no figura en el array");
            }

            //EXPANSION 3: Almacenar las posiciones donde figura el número pedido en un array de longitud igual al número total de posiciones
            int[] posicionesExactas = new int[contador];

            System.out.print("Posiciones donde figura el número: ");
            for (int i = 0; i < contador; i++) {
                posicionesExactas[i] = posicionesNumero[i];
                System.out.print(posicionesExactas[i] + " ");
            }
    }
}
