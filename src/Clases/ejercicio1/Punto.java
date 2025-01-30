package Clases.ejercicio1;

public class Punto {
    int coordX;
    int coordY;
    public Punto(){
        this(0,0);
    }
    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void mostrarCoordenadas() {
        System.out.printf("(%d,%d)\n", this.coordX, this.coordY);
    }
}
