package co.edu.uniquindio.poo;//name space
public class Circulo extends Figura {
    private final double radio;

    public Circulo( double radio) {
        
        assert radio > 0 :"El radio debe de ser positivo";
        this.radio = radio;
    }

    @Override
    public  double calcularArea() {
      return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }


    
}
