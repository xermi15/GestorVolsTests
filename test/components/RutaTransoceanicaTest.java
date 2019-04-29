/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import components.RutaTransoceanica;

/**
 *
 * @author Xavi
 */
public class RutaTransoceanicaTest {
    
    RutaTransoceanica ruta;
    
    public void setUp() {        
        ruta = new RutaTransoceanica("codi", "BCN", "NY", "ES", "EEUU", "EU","AM","ATL", 6000);
    }
    
    @Test
    public void testGetPaisOri() {
        assertEquals("paisOri", ruta.getPaisOri());
    }
    
    @Test
    public void testGetPaisDes() {
        assertEquals("paisDes", ruta.getPaisDes());
    }
    
    @Test
    public void testGetOcea() {
        assertEquals("oceaTest", ruta.getOcea());
    }
}
