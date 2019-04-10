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
public class ClasseTest {
    
    public ClasseTest() {
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
     * Test of getNom method, of class Classe.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Classe instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Classe.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Classe instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacitat method, of class Classe.
     */
    @Test
    public void testGetCapacitat() {
        System.out.println("getCapacitat");
        Classe instance = null;
        int expResult = 0;
        int result = instance.getCapacitat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacitat method, of class Classe.
     */
    @Test
    public void testSetCapacitat() {
        System.out.println("setCapacitat");
        int capacitat = 0;
        Classe instance = null;
        instance.setCapacitat(capacitat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaClasse method, of class Classe.
     */
    @Test
    public void testNovaClasse() {
        System.out.println("novaClasse");
        Classe expResult = null;
        Classe result = Classe.novaClasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class Classe.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        Classe instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Classe.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Classe instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
