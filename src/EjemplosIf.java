import java.util.Scanner;

public class EjemplosIf {

    public static void main(String[] args) {

        System.out.println("Dime tu edad y vemos");
        Scanner leer = new Scanner(System.in);

        int edad = leer.nextInt();

        int puntos = 0;
        System.out.println("Tu edad es: " + edad);
        if (edad > 18) {
            System.out.println("Eres mayor de edad.");
            puntos += 10;
        } else if (edad == 17) {
            System.out.println("Estás a punto! Ánimo");
            puntos += 3;
        } else {
            System.out.println("Eres menor (todavia)");
            puntos += 1;
        }

        System.out.println("Tus puntos son: " + puntos);


    }
}
