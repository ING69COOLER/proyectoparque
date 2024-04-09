package co.edu.uniquindio.poo;
import java.util.Collection;

public class ZonaParque {
    public final String nombre;
    public Material material;
    private  final Collection<Figura> listaFiguras;
    public ZonaParque(String nombre, Collection<Figura> listaFiguras) {
        this.nombre = nombre;
        this.material = material;
        this.listaFiguras = listaFiguras;
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Figura> getListaFiguras() {
        return listaFiguras;
    }
    public Material getMaterial() {
        return material;
    }

    
}
