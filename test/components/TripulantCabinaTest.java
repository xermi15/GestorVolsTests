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
      tripulant = Tripulant();
    }

    @After
    public void tearDown() {
    }

    @Test
  	public void testGetPassaport() {
  		assertEquals("PassaportTest", tripulant.getPassaport());
  	}

  	@Test
  	public void testSetPassaport() {
  		tripulant.setPassaport("PassaportTest2");
  		assertEquals("PassaportTest2", tripulant.getPassaport());
  	}

  	@Test
  	public void testGetNom() {
  		assertEquals("NomTest", tripulant.getNom());
  	}

  	@Test
  	public void testSetNom() {
  		tripulant.setNom("NomTest2");
  		assertEquals("NomTest2", tripulant.getNom());
  	}

  	@Test
  	public void testGetEdat() {
  		assertEquals(40, tripulant.getEdat());
  	}

  	@Test
  	public void testSetEdat() {
  		tripulant.setEdat(15);
  		assertEquals(15, tripulant.getEdat());
  	}

  	@Test
  	public void testGetDataAlta() {
  		assertEquals(data, tripulant.getDataAlta());
  	}

    @Test
    public void testSetDataAlta() {
    	dTripulant = new Date();
    	tripulant.setDataAlta(dataAlta);
    	assertEquals(dTripulant, tripulant.getDataAlta());
    }

    @Test
    public void testGetHoresVol() {
    	assertEquals(100, tripulant.getHoresVol());
    }

    @Test
    public void testSetHoresVol() {
    	tripulant.setHoresVol(200);
    	assertEquals(200, tripulant.getHoresVol());
    }

    @Test
      public void testGetRang() {
        assertEquals("Comandant", tripulant.getRang());
      }

    @Test
      public void testSetRang() {
        tripulant.setRang("C");
        assertEquals("C", tripulant.getRang());
      }

}
