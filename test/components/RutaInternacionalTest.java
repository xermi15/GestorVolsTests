/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import components.RutaInternacional;

/**
 *
 * @author Xavi
 */
public class RutaInternacionalTest {
    
    RutaInternacional ruta;
    
    public void setUp() {        
        ruta = new RutaInternacional("codi", "BCN", "PRS", "ES", "FR", 123);
    }
    
    @Test
    public void testGetPaisOri() {
        assertEquals("paisOri", ruta.getPaisOri());
    }
    
    @Test
    public void testGetPaisDes() {
        assertEquals("paisDes", ruta.getPaisDes());
    }

}
