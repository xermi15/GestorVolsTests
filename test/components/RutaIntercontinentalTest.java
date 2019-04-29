/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import components.RutaIntercontinental;

/**
 *
 * @author Xavi
 */
public class RutaIntercontinentalTest {
    
    private RutaIntercontinental ruta;
    
    public void setUp() {        
        ruta = new RutaIntercontinental("codi", "BCN", "MW", "ES", "RUS", "EU","AS", 5000);
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
    public void testGetContinentOri() {
        assertEquals("contiOri", ruta.getPaisOri());
    }
    
    @Test
    public void testGetContinentDes() {
        assertEquals("contiDes", ruta.getContinentDes());
    }
}