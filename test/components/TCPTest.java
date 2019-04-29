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

import Components.TripulantCabina;

/**
 *
 * @author Xavi
 */
public class TCPTest {

    private TripulantCabina tripulant;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      tripulant = new TripulantCabina('pass', 'nom', 40, 900);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of nouTCP method, of class TCP.
     */
    @Test
    public void testNouTCP() {
        System.out.println("nouTCP");
        TCP expResult = null;
        TCP result = TCP.nouTCP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
