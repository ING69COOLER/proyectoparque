package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    public final double ancho;
    public final double alto;
    public Rectangulo(double ancho, double alto) {
        assert ancho>0;
        assert alto >0;
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }
    @Override
    public double calcularArea() {
       return ancho*alto;
    }
    
    
}
