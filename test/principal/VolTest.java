/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import components.Avio;
import components.Ruta;
import components.TCP;
import components.Tripulant;
import java.time.LocalTime;
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
public class VolTest {
    
    public VolTest() {
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
     * Test of getCodi method, of class Vol.
     */
    @Test
    public void testGetCodi() {
        System.out.println("getCodi");
        Vol instance = null;
        String expResult = "";
        String result = instance.getCodi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodi method, of class Vol.
     */
    @Test
    public void testSetCodi() {
        System.out.println("setCodi");
        String codi = "";
        Vol instance = null;
        instance.setCodi(codi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuta method, of class Vol.
     */
    @Test
    public void testGetRuta() {
        System.out.println("getRuta");
        Vol instance = null;
        Ruta expResult = null;
        Ruta result = instance.getRuta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuta method, of class Vol.
     */
    @Test
    public void testSetRuta() {
        System.out.println("setRuta");
        Ruta ruta = null;
        Vol instance = null;
        instance.setRuta(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvio method, of class Vol.
     */
    @Test
    public void testGetAvio() {
        System.out.println("getAvio");
        Vol instance = null;
        Avio expResult = null;
        Avio result = instance.getAvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvio method, of class Vol.
     */
    @Test
    public void testSetAvio() {
        System.out.println("setAvio");
        Avio avio = null;
        Vol instance = null;
        instance.setAvio(avio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTripulacio method, of class Vol.
     */
    @Test
    public void testGetTripulacio() {
        System.out.println("getTripulacio");
        Vol instance = null;
        Tripulant[] expResult = null;
        Tripulant[] result = instance.getTripulacio();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTripulacio method, of class Vol.
     */
    @Test
    public void testSetTripulacio() {
        System.out.println("setTripulacio");
        Tripulant[] tripulacio = null;
        Vol instance = null;
        instance.setTripulacio(tripulacio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicioTripulacio method, of class Vol.
     */
    @Test
    public void testGetPosicioTripulacio() {
        System.out.println("getPosicioTripulacio");
        Vol instance = null;
        int expResult = 0;
        int result = instance.getPosicioTripulacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicioTripulacio method, of class Vol.
     */
    @Test
    public void testSetPosicioTripulacio() {
        System.out.println("setPosicioTripulacio");
        int posicioTripulacio = 0;
        Vol instance = null;
        instance.setPosicioTripulacio(posicioTripulacio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSortida method, of class Vol.
     */
    @Test
    public void testGetDataSortida() {
        System.out.println("getDataSortida");
        Vol instance = null;
        Date expResult = null;
        Date result = instance.getDataSortida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSortida method, of class Vol.
     */
    @Test
    public void testSetDataSortida() {
        System.out.println("setDataSortida");
        Date dataSortida = null;
        Vol instance = null;
        instance.setDataSortida(dataSortida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataArribada method, of class Vol.
     */
    @Test
    public void testGetDataArribada() {
        System.out.println("getDataArribada");
        Vol instance = null;
        Date expResult = null;
        Date result = instance.getDataArribada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataArribada method, of class Vol.
     */
    @Test
    public void testSetDataArribada() {
        System.out.println("setDataArribada");
        Date dataArribada = null;
        Vol instance = null;
        instance.setDataArribada(dataArribada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraSortida method, of class Vol.
     */
    @Test
    public void testGetHoraSortida() {
        System.out.println("getHoraSortida");
        Vol instance = null;
        LocalTime expResult = null;
        LocalTime result = instance.getHoraSortida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraSortida method, of class Vol.
     */
    @Test
    public void testSetHoraSortida() {
        System.out.println("setHoraSortida");
        LocalTime horaSortida = null;
        Vol instance = null;
        instance.setHoraSortida(horaSortida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraArribada method, of class Vol.
     */
    @Test
    public void testGetHoraArribada() {
        System.out.println("getHoraArribada");
        Vol instance = null;
        LocalTime expResult = null;
        LocalTime result = instance.getHoraArribada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraArribada method, of class Vol.
     */
    @Test
    public void testSetHoraArribada() {
        System.out.println("setHoraArribada");
        LocalTime horaArribada = null;
        Vol instance = null;
        instance.setHoraArribada(horaArribada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDurada method, of class Vol.
     */
    @Test
    public void testGetDurada() {
        System.out.println("getDurada");
        Vol instance = null;
        String expResult = "";
        String result = instance.getDurada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDurada method, of class Vol.
     */
    @Test
    public void testSetDurada() {
        System.out.println("setDurada");
        String durada = "";
        Vol instance = null;
        instance.setDurada(durada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCap method, of class Vol.
     */
    @Test
    public void testGetCap() {
        System.out.println("getCap");
        Vol instance = null;
        TCP expResult = null;
        TCP result = instance.getCap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCap method, of class Vol.
     */
    @Test
    public void testSetCap() {
        System.out.println("setCap");
        TCP cap = null;
        Vol instance = null;
        instance.setCap(cap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nouVol method, of class Vol.
     */
    @Test
    public void testNouVol() throws Exception {
        System.out.println("nouVol");
        Vol expResult = null;
        Vol result = Vol.nouVol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarComponent method, of class Vol.
     */
    @Test
    public void testModificarComponent() throws Exception {
        System.out.println("modificarComponent");
        Vol instance = null;
        instance.modificarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afegirTripulant method, of class Vol.
     */
    @Test
    public void testAfegirTripulant() {
        System.out.println("afegirTripulant");
        Tripulant tripulant = null;
        Vol instance = null;
        instance.afegirTripulant(tripulant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarComponent method, of class Vol.
     */
    @Test
    public void testMostrarComponent() {
        System.out.println("mostrarComponent");
        Vol instance = null;
        instance.mostrarComponent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
