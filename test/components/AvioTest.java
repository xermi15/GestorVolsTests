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

    public AvioTest() {
    }

    @Before
    public static void setUpClass() {
      TestEntity nTest = new TestEntity();
      avio = nTest.getAvio();
      classe = nTest.getClasses();
    }

    /**
     * Test of getCodi method, of class Avio.
     */
    @Test
    public void testGetCodi() {
        assertEquals("codiA", avio.getCodi());
    }

    /**
     * Test of setCodi method, of class Avio.
     */
    @Test
    public void testSetCodi() {
        avio.setCodi("CodiA");
        assertEquals("CodiA", avio.getCodi());
    }

    /**
     * Test of getFabricant method, of class Avio.
     */
    @Test
    public void testGetFabricant() {
        assertEquals("CodiF", avio.getFabricant());
    }

    /**
     * Test of setFabricant method, of class Avio.
     */
    @Test
    public void testSetFabricant() {
        avio.setFabricant('CodiF');
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
     * Test of setModel method, of class Avio.
     */
    @Test
    public void testSetModel() {
        avio.setModel("mTest");
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
     * Test of setCapacitat method, of class Avio.
     */
    @Test
    public void testSetCapacitat() {
        avio.setCapacitat(150);
        assertEquals(150, avio.getCapacitat());
    }

    /**
     * Test of getClasses method, of class Avio.
     */
    @Test
    public void testGetClasses() {
        assertEquals(classe, avio.getClasses());
    }

    /**
     * Test of setClasses method, of class Avio.
     */
    @Test
    public void testSetClasses() {
      Classe[] classTest = new Classe("testClass", 100);
      avio.setClasses(classTest);
      assertEquals(classTest[0].getNom(), avio.getClasses()[0].getNom());
    }

    /**
     * Test of getPosicioClasses method, of class Avio.
     */
    @Test
    public void testGetPosicioClasses() {
        assertEquals(0, avio.getPosicioClasses());
    }

    /**
     * Test of setPosicioClasses method, of class Avio.
     */
    @Test
    public void testSetPosicioClasses() {
        avio.setPosicioClasses(1);
        assertEquals(1, avio.getPosicioClasses());
    }
}
