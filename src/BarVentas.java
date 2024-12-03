import java.util.Scanner;

public class BarVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        int numSemana = 0;

        while (continuar){

            double ventasDia = 0;
            double ventaDomingo = 0;
            double ventaMaxima = 0;
            double ventaMinima = 0;
            double totalVentas = 0;
            double mediaVentas = 0;
            int diaMayorVenta = 0;
            int diaMenorVenta = 0;

            ventaMaxima = ventasDia; //asignamos para que tenga un primer valor
            ventaMinima = ventasDia; //asignamos para que tenga un primer valor

            System.out.println("semana " + (numSemana + 1));
            System.out.println("-----------------------");

            for (int numdia = 0; numdia < 6; numdia++) {
                System.out.print("Venta Dia: "  + (numdia + 1) + ": ");
                ventasDia = scanner.nextDouble(); // se guarda la venta del dia

                if (ventasDia != -1){
                    totalVentas += ventasDia;

                    //ventaMaxima y ventaMinima se comprara con el valor introdcirlo
                    if (ventasDia > ventaMaxima) { //si la venta del dia es mayor se almacena en ventaMaxima
                        ventaMaxima = ventasDia;
                        diaMayorVenta = numdia;
                    }

                    if (ventasDia < ventaMinima) {
                        ventaMinima = ventasDia;
                        diaMenorVenta = numdia;
                    }

                    if (numdia == 5) {
                        ventaDomingo = numdia;
                    }

                } else {
                    continuar = false;
                    break;
                }
            }


            String maxDia = switch (diaMayorVenta){
                case 0 -> "Martes";
                case 1 -> "Miercoles";
                case 2 -> "Jueves";
                case 3 -> "viernes";
                case 4 -> "Sabado";
                case 5 -> "Domingo";
                default -> "";
            };

            String minDia = switch (diaMenorVenta){
                case 0 -> "Martes";
                case 1 -> "Miercoles";
                case 2 -> "Jueves";
                case 3 -> "viernes";
                case 4 -> "Sabado";
                case 5 -> "Domingo";
                default -> "";
            };

            //mediaVentas
            mediaVentas = totalVentas / 6;

            // Comparación de la media de ventas con el domingo

            String domingoSuperaMedia = ventaDomingo > mediaVentas ? "SI":"NO";

            System.out.println(maxDia + " " + minDia + " " + domingoSuperaMedia);
            numSemana++;
        }
    }
}
