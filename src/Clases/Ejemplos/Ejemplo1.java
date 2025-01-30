package Clases.Ejemplos;

public class Ejemplo1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 3, "Madrid", "Informática", "4444N");
        Persona persona2 = new Persona("Diego", 3, "Sevilla", "dependienta", "5554N");

        persona1.mostrarDatos();
        System.out.println("-------------------------------");
        persona2.mostrarDatos();
    }
}
