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

    public void testGetPaisOri() {
        assertEquals("paisOri", ruta.getPaisOri());
    }

    public void testSetPaisOri(String paisOri) {
        ruta.setPaisOri("paisOri2");
        assertEquals("paisOri2", ruta.getPaisOri());
    }

    public void testGetPaisDes() {
        assertEquals("paisDes", ruta.getPaisDes());
    }

    public void testSetPaisDes(String paisDes) {
        ruta.setPaisDes("paisDes2");
        assertEquals("paisDes2", ruta.getPaisDes());
    }
    
    public void testGetContinentOri() {
        assertEquals("contiOri", ruta.getPaisOri());
    }

    public void testSetContinentOri() {
        ruta.setPaisOri("contiOri2");
        assertEquals("contiOri2", ruta.getContinentOri());
    }

    public void testGetContinentDes() {
        assertEquals("contiDes", ruta.getContinentDes());
    }

    public void testSetContinentDes() {
        ruta.setPaisDes("contiDes2");
        assertEquals("contiDes2", ruta.getContinentDes());
    }
}