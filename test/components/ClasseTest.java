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
import components.Classe;

/**
 *
 * @author Xavi
 */
public class ClasseTest {

    private Classe claseTest;

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
      claseTest = new Classe('Nom', 10);
    }

    /**
     * Test of getNom method, of class Classe.
     */
    @Test
    public void testGetNom() {
        assertEquals("nomTest", claseTest.getNom());
    }

    /**
     * Test of getCapacitat method, of class Classe.
     */
    @Test
    public void testGetCapacitat() {
        assertEquals(100, claseTest.getCapacitat());
    }

}
