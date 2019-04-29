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
public class AvioTest {

    private Avio avio;

    @Before
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
      avio = new Avio('codi', 'fabricant', 'model', 10);
    }

    /**
     * Test of getCodi method, of class Avio.
     */
    @Test
    public void testGetCodi() {
        assertEquals("codiA", avio.getCodi());
    }

    /**
     * Test of getFabricant method, of class Avio.
     */
    @Test
    public void testGetFabricant() {
        assertEquals("CodiF", avio.getFabricant());
    }


    /**
     * Test of getModel method, of class Avio.
     */
    @Test
    public void testGetModel() {
        assertEquals("mTest", avio.getModel());
    }

    /**
     * Test of getCapacitat method, of class Avio.
     */
    @Test
    public void testGetCapacitat() {
        assertEquals(100, avio.getCapacitat());
    }

    /**
     * Test of getClasses method, of class Avio.
     */
    @Test
    public void testGetClasses() {
        assertEquals(classe, avio.getClasses());
    }


    /**
     * Test of getPosicioClasses method, of class Avio.
     */
    @Test
    public void testGetPosicioClasses() {
        assertEquals(0, avio.getPosicioClasses());
    }

}
