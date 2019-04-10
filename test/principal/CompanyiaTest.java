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
public class CompanyiaTest {
    
    public CompanyiaTest() {
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
     * Test of getCodi method, of class Companyia.
     */
    @Test
    public void testGetCodi() {
        System.out.println("getCodi");
        Companyia instance = null;
        int expResult = 0;
        int result = instance.getCodi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodi method, of class Companyia.
     */
    @Test
    public void testSetCodi() {
        System.out.println("setCodi");
        Companyia instance = null;
        instance.setCodi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperCodi method, of class Companyia.
     */
    @Test
    public void testGetProperCodi() {
        System.out.println("getProperCodi");
        int expResult = 0;
        int result = Companyia.getProperCodi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperCodi method, of class Companyia.
     */
    @Test
    public void testSetProperCodi() {
        System.out.println("setProperCodi");
        Companyia.setProperCodi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Companyia.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Companyia instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Companyia.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Companyia instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComponents method, of class Companyia.
     */
    @Test
    public void testGetComponents() {
        System.out.println("getComponents");
        Companyia instance = null;
        Component[] expResult = null;
        Component[] result = instance.getComponents();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComponents method, of class Companyia.
     */
    @Test
    public void testSetComponents() {
        System.out.println("setComponents");
        Component[] components = null;
        Companyia instance = null;
        instance.setComponents(components);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicioComponents method, of class Companyia.
     */
    @Test
    public void testGetPosicioComponents() {
        System.out.println("getPosicioComponents");
        Companyia instance = null;
        int expResult = 0;
        int result = instance.getPosicioComponents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicioComponents method, of class Companyia.
     */
    @Test
    public void testSetPosicioComponents() {
        System.out.println("setPosicioComponents");
        int posicioComponents = 0;
        Companyia instance = null;
        instance.setPosicioComponents(posicioComponents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaCompanyia method, of class Companyia.
     */
    @Test
    public void testNovaCompanyia() {
        System.out.println("novaCompanyia");
        Companyia expResult = null;
        Companyia result = Companyia.novaCompanyia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class Companyia.
     */
    @Test
    public void testModificarComponent() {
        System.out.println("modificarComponent");
        Companyia instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Companyia.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Companyia instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirAvio method, of class Companyia.
     */
    @Test
    public void testAfegirAvio() {
        System.out.println("afegirAvio");
        Companyia instance = null;
        instance.afegirAvio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirRutaNacional method, of class Companyia.
     */
    @Test
    public void testAfegirRutaNacional() {
        System.out.println("afegirRutaNacional");
        Companyia instance = null;
        instance.afegirRutaNacional();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirRutaInternacional method, of class Companyia.
     */
    @Test
    public void testAfegirRutaInternacional() {
        System.out.println("afegirRutaInternacional");
        Companyia instance = null;
        instance.afegirRutaInternacional();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirRutaIntercontinental method, of class Companyia.
     */
    @Test
    public void testAfegirRutaIntercontinental() {
        System.out.println("afegirRutaIntercontinental");
        Companyia instance = null;
        instance.afegirRutaIntercontinental();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirRutaTransoceanica method, of class Companyia.
     */
    @Test
    public void testAfegirRutaTransoceanica() {
        System.out.println("afegirRutaTransoceanica");
        Companyia instance = null;
        instance.afegirRutaTransoceanica();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirTripulantCabina method, of class Companyia.
     */
    @Test
    public void testAfegirTripulantCabina() {
        System.out.println("afegirTripulantCabina");
        Companyia instance = null;
        instance.afegirTripulantCabina();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirTCP method, of class Companyia.
     */
    @Test
    public void testAfegirTCP() {
        System.out.println("afegirTCP");
        Companyia instance = null;
        instance.afegirTCP();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirVol method, of class Companyia.
     */
    @Test
    public void testAfegirVol() throws Exception {
        System.out.println("afegirVol");
        Companyia instance = null;
        instance.afegirVol();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarComponent method, of class Companyia.
     */
    @Test
    public void testSeleccionarComponent() {
        System.out.println("seleccionarComponent");
        int tipus = 0;
        String id = "";
        Companyia instance = null;
        int expResult = 0;
        int result = instance.seleccionarComponent(tipus, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirAvioVol method, of class Companyia.
     */
    @Test
    public void testAfegirAvioVol() {
        System.out.println("afegirAvioVol");
        Companyia instance = null;
        instance.afegirAvioVol();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirTripulantVol method, of class Companyia.
     */
    @Test
    public void testAfegirTripulantVol() {
        System.out.println("afegirTripulantVol");
        int tipus = 0;
        Companyia instance = null;
        instance.afegirTripulantVol(tipus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirRutaVol method, of class Companyia.
     */
    @Test
    public void testAfegirRutaVol() {
        System.out.println("afegirRutaVol");
        int tipus = 0;
        Companyia instance = null;
        instance.afegirRutaVol(tipus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
