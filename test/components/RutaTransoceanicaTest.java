/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavi
 */
public class RutaTransoceanicaTest {
    
    public RutaTransoceanicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOcea method, of class RutaTransoceanica.
     */
    @Test
    public void testGetOcea() {
        System.out.println("getOcea");
        RutaTransoceanica instance = null;
        String expResult = "";
        String result = instance.getOcea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOcea method, of class RutaTransoceanica.
     */
    @Test
    public void testSetOcea() {
        System.out.println("setOcea");
        String ocea = "";
        RutaTransoceanica instance = null;
        instance.setOcea(ocea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaRutaTransoceanica method, of class RutaTransoceanica.
     */
    @Test
    public void testNovaRutaTransoceanica() {
        System.out.println("novaRutaTransoceanica");
        RutaTransoceanica expResult = null;
        RutaTransoceanica result = RutaTransoceanica.novaRutaTransoceanica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class RutaTransoceanica.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        RutaTransoceanica instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class RutaTransoceanica.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        RutaTransoceanica instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
