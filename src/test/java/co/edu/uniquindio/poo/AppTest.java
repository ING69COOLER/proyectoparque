/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void areaCirculoPositivo() {
        LOG.info("Iniciado test areaCirculoPositivo");
        Circulo circulo = new Circulo(10.00);
        assertEquals(314.159, circulo.calcularArea(),0.05);
        LOG.info("Finalizando test areaCirculoPositivo");
    }

    @Test
    public void areaCirculoNegativa() {
        LOG.info("Iniciado test areaCirculoNegativa");
        assertThrows(Throwable.class,()-> new Circulo(-10));
        
        LOG.info("Finalizando test areaCirculoNegativa");
    }
    @Test
    public void areaRectangulo() {
        LOG.info("Iniciado test areaRectangulo");
        Rectangulo rectangulo = new Rectangulo(10, 40);
        assertEquals(400, rectangulo.calcularArea());
        
        LOG.info("Finalizando test areaRectangulo");
    }


}
