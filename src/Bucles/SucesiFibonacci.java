package Bucles;

public class SucesiFibonacci {
    public static void main(String[] args) {
        long[] numeros = new long[3];
        for (int i = 0; i < 50; i++) {
            if (numeros[0] != 0){
                numeros[2] = numeros[1];
            }else {
                System.out.println(numeros[0]);
                numeros[0] = 1;
            }
            numeros[1] = numeros[0];
            System.out.println(numeros[0]);
            numeros[0] = numeros[1] + numeros[2];
        }
    }
}
