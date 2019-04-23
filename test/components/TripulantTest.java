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

    private Tripulant tripulantTest;
    private date dateTripulant;


    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      tripulantTest = new Tripulant();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPassaport method, of class Tripulant.
     */
    @Test
    public void testGetPassaport() {
        assertEquals("passTest", tripulantTest.getPassaport());
    }

    /**
     * Test of setPassaport method, of class Tripulant.
     */
    @Test
    public void testSetPassaport() {
        tripulantTest.setPassaport("passTest");
        assertEquals("passTest", tripulantTest.getPassaport());
    }

    /**
     * Test of getNom method, of class Tripulant.
     */
    @Test
    public void testGetNom() {
        assertEquals("nomTest", tripulantTest.getNom());
    }

    /**
     * Test of setNom method, of class Tripulant.
     */
    @Test
    public void testSetNom() {
        tripulantTest.setNom("nomTest");
        assertEquals("nomTest", tripulantTest.getNom());
    }

    /**
     * Test of getEdat method, of class Tripulant.
     */
    @Test
    public void testGetEdat() {
        assertEquals(50, tripulantTest.getEdat());
    }

    /**
     * Test of setEdat method, of class Tripulant.
     */
    @Test
    public void testSetEdat() {
        tripulantTest.setEdat(51);
        assertEquals(51, tripulantTest.getEdat());
    }

    /**
     * Test of getDataAlta method, of class Tripulant.
     */
    @Test
    public void testGetDataAlta() {
        assetEquals(dateTripulant, tripulantTest.getDataAlta());
    }

    /**
     * Test of setDataAlta method, of class Tripulant.
     */
    @Test
    public void testSetDataAlta() {
        dateTripulant = new date();
        tripulantTest.setDataAlta(dateTripulant);
        assertEquals(dateTripulant, tripulantTest.getDataAlta());
    }

    /**
     * Test of getHoresVol method, of class Tripulant.
     */
    @Test
    public void testGetHoresVol() {
        assertEquals(50, tripulantTest.getHoresVol());
    }

    /**
     * Test of setHoresVol method, of class Tripulant.
     */
    @Test
    public void testSetHoresVol() {
        tripulantTest.setHoresVol(55);
        assertEquals(55, tripulantTest.getHoresVol());
    }

    /**
     * Test of getRang method, of class Tripulant.
     */
    @Test
    public void testGetRang() {
        assertEquals("Copilot", tripulantTest.getRang());
    }

    /**
     * Test of setRang method, of class Tripulant.
     */
    @Test
    public void testSetRang() {
        tripulantTest.setRang("C");
        assertEquals("C", tripulantTest.getRang());
    }

}
