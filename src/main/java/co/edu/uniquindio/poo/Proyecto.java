package co.edu.uniquindio.poo;
import java.util.Collection;
;

public class Proyecto {
    private final String nombre;
    private final double costoTotal;
    
    private final Collection<Parque> listaParques;

    public Proyecto(String nombre, double costoTotal, Collection<Parque> listaParques) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
      
        this.listaParques = listaParques;
    }


    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    

    public Collection<Parque> getListaParques() {
        return listaParques;
    }

   
}
