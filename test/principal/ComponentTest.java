/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
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
public class ComponentTest {
    
    public ComponentTest() {
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
     * Test of modificarComponent method, of class Component.
     */
    @Test
    public void testModificarComponent() throws Exception {
        System.out.println("modificarComponent");
        Component instance = new ComponentImpl();
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Component.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Component instance = new ComponentImpl();
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of demanarDades method, of class Component.
     */
    @Test
    public void testDemanarDades() {
        System.out.println("demanarDades");
        String peticio = "";
        int tipus = 0;
        Component instance = new ComponentImpl();
        Object expResult = null;
        Object result = instance.demanarDades(peticio, tipus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ComponentImpl implements Component {

        public void modificarComponent() throws ParseException {
        }

        public void mostrarComponent() {
        }
    }
    
}
