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
public class RutaInternacionalTest {
    
    public RutaInternacionalTest() {
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
     * Test of getPaisOri method, of class RutaInternacional.
     */
    @Test
    public void testGetPaisOri() {
        System.out.println("getPaisOri");
        RutaInternacional instance = null;
        String expResult = "";
        String result = instance.getPaisOri();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaisOri method, of class RutaInternacional.
     */
    @Test
    public void testSetPaisOri() {
        System.out.println("setPaisOri");
        String paisOri = "";
        RutaInternacional instance = null;
        instance.setPaisOri(paisOri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaisDes method, of class RutaInternacional.
     */
    @Test
    public void testGetPaisDes() {
        System.out.println("getPaisDes");
        RutaInternacional instance = null;
        String expResult = "";
        String result = instance.getPaisDes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaisDes method, of class RutaInternacional.
     */
    @Test
    public void testSetPaisDes() {
        System.out.println("setPaisDes");
        String paisDes = "";
        RutaInternacional instance = null;
        instance.setPaisDes(paisDes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaRutaInternacional method, of class RutaInternacional.
     */
    @Test
    public void testNovaRutaInternacional() {
        System.out.println("novaRutaInternacional");
        RutaInternacional expResult = null;
        RutaInternacional result = RutaInternacional.novaRutaInternacional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class RutaInternacional.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        RutaInternacional instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class RutaInternacional.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        RutaInternacional instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
