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
    public void testGetPais() {
        assertEquals("pais", ruta.getPais());
    }
}