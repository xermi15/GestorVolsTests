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
public class TripulantCabinaTest {
    
    public TripulantCabinaTest() {
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
     * Test of getBarres method, of class TripulantCabina.
     */
    @Test
    public void testGetBarres() {
        System.out.println("getBarres");
        TripulantCabina instance = null;
        int expResult = 0;
        int result = instance.getBarres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBarres method, of class TripulantCabina.
     */
    @Test
    public void testSetBarres() {
        System.out.println("setBarres");
        int barres = 0;
        TripulantCabina instance = null;
        instance.setBarres(barres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nouTripulantCabina method, of class TripulantCabina.
     */
    @Test
    public void testNouTripulantCabina() {
        System.out.println("nouTripulantCabina");
        TripulantCabina expResult = null;
        TripulantCabina result = TripulantCabina.nouTripulantCabina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class TripulantCabina.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        TripulantCabina instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class TripulantCabina.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        TripulantCabina instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignarBarres method, of class TripulantCabina.
     */
    @Test
    public void testAssignarBarres() {
        System.out.println("assignarBarres");
        String pRang = "";
        TripulantCabina instance = null;
        instance.assignarBarres(pRang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
