/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Date;
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
public class TripulantTest {
    
    public TripulantTest() {
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
     * Test of getPassaport method, of class Tripulant.
     */
    @Test
    public void testGetPassaport() {
        System.out.println("getPassaport");
        Tripulant instance = null;
        String expResult = "";
        String result = instance.getPassaport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassaport method, of class Tripulant.
     */
    @Test
    public void testSetPassaport() {
        System.out.println("setPassaport");
        String passaport = "";
        Tripulant instance = null;
        instance.setPassaport(passaport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Tripulant.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Tripulant instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Tripulant.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Tripulant instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdat method, of class Tripulant.
     */
    @Test
    public void testGetEdat() {
        System.out.println("getEdat");
        Tripulant instance = null;
        int expResult = 0;
        int result = instance.getEdat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdat method, of class Tripulant.
     */
    @Test
    public void testSetEdat() {
        System.out.println("setEdat");
        int edat = 0;
        Tripulant instance = null;
        instance.setEdat(edat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataAlta method, of class Tripulant.
     */
    @Test
    public void testGetDataAlta() {
        System.out.println("getDataAlta");
        Tripulant instance = null;
        Date expResult = null;
        Date result = instance.getDataAlta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataAlta method, of class Tripulant.
     */
    @Test
    public void testSetDataAlta() {
        System.out.println("setDataAlta");
        Date dataAlta = null;
        Tripulant instance = null;
        instance.setDataAlta(dataAlta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoresVol method, of class Tripulant.
     */
    @Test
    public void testGetHoresVol() {
        System.out.println("getHoresVol");
        Tripulant instance = null;
        int expResult = 0;
        int result = instance.getHoresVol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoresVol method, of class Tripulant.
     */
    @Test
    public void testSetHoresVol() {
        System.out.println("setHoresVol");
        int horesVol = 0;
        Tripulant instance = null;
        instance.setHoresVol(horesVol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRang method, of class Tripulant.
     */
    @Test
    public void testGetRang() {
        System.out.println("getRang");
        Tripulant instance = null;
        String expResult = "";
        String result = instance.getRang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRang method, of class Tripulant.
     */
    @Test
    public void testSetRang() {
        System.out.println("setRang");
        String rang = "";
        Tripulant instance = null;
        instance.setRang(rang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class Tripulant.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        Tripulant instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Tripulant.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Tripulant instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TripulantImpl extends Tripulant {

        public TripulantImpl() {
            super("", "", 0, 0);
        }
    }
    
}
