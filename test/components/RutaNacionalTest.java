/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import components.RutaNacional;

/**
 *
 * @author Xavi
 */
public class RutaNacionalTest {
    private RutaNacional ruta;
    
    public void setUp() {        
        ruta = new RutaNacional("codi", "ES", "BCN", "MAD", 600);
    }
    
    @Test
    public void testGetCodi() {
        assertEquals("cTest", ruta.getCodi());
    }

    @Test
    public void testSetCodi() {
        ruta.setCodi("cTest2");
        assertEquals("cTest2", ruta.getCodi());
    }

    @Test
    public void testGetAeroportOri() {
        assertEquals("aerOriTest", ruta.getAeroportOri());
    }

    @Test
    public void testSetAeroportOri() {
        ruta.setAeroportOri("aerOriTest2");
        assertEquals("aerOriTest2", ruta.getAeroportOri());
    }

    @Test
    public void testGetAeroportDes() {
        assertEquals("aerDesTest", ruta.getAeroportDes());
    }

    @Test
    public void testSetAeroportDes() {
        ruta.setAeroportDes("aerDesTest2");
        assertEquals("aerDesTest2", ruta.getAeroportDes());
    }

    @Test
    public void testGetDistancia() {
        assertEquals(String.valueOf(1000.0), String.valueOf(ruta.getDistancia()));
    }

    @Test
    public void testSetDistancia() {
        ruta.setDistancia(2000.0);
        assertEquals(String.valueOf(2000.0), String.valueOf(ruta.getDistancia()));
    }

    @Test
    public void testGetPais() {
        assertEquals("pais", ruta.getPais());
    }

    @Test
    public void testSetPais() {
        ruta.setPais("paisTest2");
        assertEquals("paisTest2", ruta.getPais());
    }
}