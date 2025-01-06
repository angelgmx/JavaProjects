import java.util.Scanner;

public class ConversionBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número decimal: ");
        int numeroDecimal = scanner.nextInt();

        //creamos un array para almecenar los digitos binarios
        int[] binario = new int[32];
        int indice = 0;

        //convertir el número decimal a binario
        int numero = numeroDecimal;

        while (numero > 0){ //mientras numero sea mayor que 0

            binario[indice] = numero % 2; //residio 0 o 1 lo almacenamos
            numero = numero / 2;
            indice++;

        }
        // ahora tenemos que Mostrar el binario en orden inverso (de mayor a menor peso)
        System.out.print("El numero " + numeroDecimal + "en binario es ");

        if (indice == 0) {
            System.out.println("0");
        } else {
            for (int i = indice -1; i >= 0; i--) {
                System.out.print(binario[i]);
            }
        }
    }
}
