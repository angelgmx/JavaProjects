package Bucles;

public class SumaParesyImpares {
    public static void main(String[] args) {
        int sumPares = 0, sumImpares = 0;
        for (int num = 100; num <= 200; num++) {
            if (num % 2 == 0) {
                sumPares = sumPares + num;
            } else {
                sumImpares = sumImpares + num;
            }

        }
        System.out.println("suma de todos los pares es: " + sumPares);
        System.out.println("suma de todos los impares es: " + sumImpares);
    }
}
