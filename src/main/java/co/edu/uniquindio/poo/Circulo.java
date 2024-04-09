package co.edu.uniquindio.poo;//name space
public class Circulo extends Figura {
    private final double radio;

   

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }



    public double getRadio() {
        return radio;
    }

    
}
