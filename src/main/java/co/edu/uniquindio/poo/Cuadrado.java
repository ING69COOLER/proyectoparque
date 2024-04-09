package co.edu.uniquindio.poo;


public class Cuadrado extends Rectangulo {
    public final double lado;

    public Cuadrado(String nombre, double ancho, double alto, double lado) {
        super(nombre, ancho, alto);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
