package ARRAYS;

public class arraybidimensional {
    public static void main(String[] args) {
        int [][] notasAlumnos = new int[4][3];
        notasAlumnos[0][1]= 0;
        notasAlumnos[0][2]= 0;
        notasAlumnos[1][0]= 0;
        notasAlumnos[1][1]= 0;
        notasAlumnos[1][2]= 0;
        System.out.println("segunda nota del primer alumno: " + notasAlumnos[0][1]);
        System.out.println("Tercera nota del segundo alumno: " + notasAlumnos[0][2]);

        int[] notasDelPrimerAlumno = notasAlumnos[0];

        System.out.println("Total notas del primer alumno " + notasDelPrimerAlumno.length);

    }

}
