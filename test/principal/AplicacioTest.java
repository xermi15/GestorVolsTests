/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
public class AplicacioTest {
    
    public AplicacioTest() {
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
     * Test of main method, of class Aplicacio.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Aplicacio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCompanyes method, of class Aplicacio.
     */
    @Test
    public void testMenuCompanyes() {
        System.out.println("menuCompanyes");
        Aplicacio.menuCompanyes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuComponents method, of class Aplicacio.
     */
    @Test
    public void testMenuComponents() throws Exception {
        System.out.println("menuComponents");
        int tipus = 0;
        Aplicacio.menuComponents(tipus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCompanyia method, of class Aplicacio.
     */
    @Test
    public void testSelectCompanyia() {
        System.out.println("selectCompanyia");
        Integer expResult = null;
        Integer result = Aplicacio.selectCompanyia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
