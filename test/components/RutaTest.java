/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import components.Ruta;

/**
 *
 * @author Xavi
 */
public class RutaTest {
    
    Ruta ruta;
    
    public void setUp() {        
        ruta = new RutaNacional("codi", "ES", "BCN", "MAD", 600);
    }
    
    @Test
    public void testGetCodi() {
        assertEquals("cTest", ruta.getCodi());
    }

    @Test
    public void testGetAeroportOri() {
        assertEquals("aerOriTest", ruta.getAeroportOri());
    }

    @Test
    public void testGetAeroportDes() {
        assertEquals("aerDesTest", ruta.getAeroportDes());
    }

    @Test
    public void testGetDistancia() {
        assertEquals(String.valueOf(1000.0), String.valueOf(ruta.getDistancia()));
    }
}

