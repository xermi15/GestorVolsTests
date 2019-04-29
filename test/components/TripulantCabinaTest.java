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

    private TripulantCabina tripulant;
    private date dTripulant;

    @Before
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      tripulant = Tripulant('pass', 'nom', 40, 800, 'CP');
    }

    @After
    public void tearDown() {
    }

    @Test
      public void testGetRang() {
        assertEquals("Comandant", tripulant.getRang());
      }

}
