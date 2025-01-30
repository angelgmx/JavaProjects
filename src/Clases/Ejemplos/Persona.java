package Clases.Ejemplos;

public class Persona {
    String nombre;
    int edad;
    String CiudadResidencia;
    String profesion;
    String dni;

    public Persona(String s, int i, String s1, String s2, String s3) {
        nombre = s;
        edad = i;
        CiudadResidencia = s1;
        profesion = s2;
        dni = s3;

    }

    public void mostrarDatos(){
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("La ciudad de residencia de la persona es: " + CiudadResidencia);
        System.out.println("La profesion de la persona es: " + profesion);
        System.out.println("El DNI de la persona es: " + dni);
    }
}
