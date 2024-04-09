package co.edu.uniquindio.poo;
public class Triangulo extends Figura {
    public final double base;
    public final double altura;
    public Triangulo(String nombre, double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    
}
