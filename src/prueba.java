import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        System.out.println("Dime ventas de cada día seguidos hasta el -1");


        Scanner teclado = new Scanner(System.in);

        double ventas; //esta variable sirve para almacenar
        int numDia = 2;
        double maximo = -1;
        double minimo = -1;
        int diaMaximo = 0;
        int diaMinimo = 0;
        double totalVentas = 0;
        double media = 0;
        int totalDias = 0;
        double ventasDomingo = 0;


        do {

            System.out.println("numDia = " + numDia);
            ventas = teclado.nextDouble();

            if (ventas != -1) {
                if (ventas > maximo) {
                    System.out.println("El max por ahora es el " + numDia);
                    maximo = ventas;
                    diaMaximo = numDia;
                }

                if (ventas < minimo || minimo == -1) {
                    System.out.println("El min por ahora es el " + numDia);
                    minimo = ventas;
                    diaMinimo = numDia;
                }

                if (numDia == 7) {
                    ventasDomingo = ventas;
                }

                totalVentas += ventas;
                numDia++;
                totalDias++;
            }


        } while (ventas != -1);

        System.out.println("El día max es el : " + diaMaximo);
        System.out.println("El día minimo es el : " + diaMinimo);
        System.out.println("totalVentas = " + totalVentas);
        System.out.println("totalDias = " + totalDias);
        media = totalVentas / totalDias;

        String nombreDiaMax = switch (diaMaximo) {
            case 2 -> "MARTES";
            case 3 -> "MIERCOLES";
            case 4 -> "JUEVES";
            case 5 -> "VIERNES";
            case 6 -> "SABADO";
            case 7 -> "DOMINGO";
            default -> "";
        };
        String nombreDiaMin = switch (diaMinimo) {
            case 2 -> "MARTES";
            case 3 -> "MIERCOLES";
            case 4 -> "JUEVES";
            case 5 -> "VIERNES";
            case 6 -> "SABADO";
            case 7 -> "DOMINGO";
            default -> "";
        };

        String domingoSuperaMedia = ventasDomingo > media ? "SI" : "NO";

        System.out.println(nombreDiaMax + " " + nombreDiaMin + " " + domingoSuperaMedia);


    }
}
