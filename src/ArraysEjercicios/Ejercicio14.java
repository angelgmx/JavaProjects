package ArraysEjercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] secuencia = new int[10];
        for (int i = 1; i < secuencia.length + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("[ %d ]",i);
            }
        }
    }
}
