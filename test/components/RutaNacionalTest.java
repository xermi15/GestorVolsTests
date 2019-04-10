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
public class RutaNacionalTest {
    
    public RutaNacionalTest() {
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
     * Test of getPais method, of class RutaNacional.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        RutaNacional instance = null;
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class RutaNacional.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "";
        RutaNacional instance = null;
        instance.setPais(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaRutaNacional method, of class RutaNacional.
     */
    @Test
    public void testNovaRutaNacional() {
        System.out.println("novaRutaNacional");
        RutaNacional expResult = null;
        RutaNacional result = RutaNacional.novaRutaNacional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class RutaNacional.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        RutaNacional instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class RutaNacional.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        RutaNacional instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
