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
public class RutaTest {
    
    public RutaTest() {
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
     * Test of getCodi method, of class Ruta.
     */
    @Test
    public void testGetCodi() {
        System.out.println("getCodi");
        Ruta instance = null;
        String expResult = "";
        String result = instance.getCodi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodi method, of class Ruta.
     */
    @Test
    public void testSetCodi() {
        System.out.println("setCodi");
        String codi = "";
        Ruta instance = null;
        instance.setCodi(codi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAeroportOri method, of class Ruta.
     */
    @Test
    public void testGetAeroportOri() {
        System.out.println("getAeroportOri");
        Ruta instance = null;
        String expResult = "";
        String result = instance.getAeroportOri();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAeroportOri method, of class Ruta.
     */
    @Test
    public void testSetAeroportOri() {
        System.out.println("setAeroportOri");
        String aeroportOri = "";
        Ruta instance = null;
        instance.setAeroportOri(aeroportOri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAeroportDes method, of class Ruta.
     */
    @Test
    public void testGetAeroportDes() {
        System.out.println("getAeroportDes");
        Ruta instance = null;
        String expResult = "";
        String result = instance.getAeroportDes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAeroportDes method, of class Ruta.
     */
    @Test
    public void testSetAeroportDes() {
        System.out.println("setAeroportDes");
        String aeroportDes = "";
        Ruta instance = null;
        instance.setAeroportDes(aeroportDes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class Ruta.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        Ruta instance = null;
        double expResult = 0.0;
        double result = instance.getDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistancia method, of class Ruta.
     */
    @Test
    public void testSetDistancia() {
        System.out.println("setDistancia");
        double distancia = 0.0;
        Ruta instance = null;
        instance.setDistancia(distancia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class Ruta.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        Ruta instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Ruta.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Ruta instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RutaImpl extends Ruta {

        public RutaImpl() {
            super("", "", "", 0.0);
        }
    }
    
}
