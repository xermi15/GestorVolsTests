/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static org.junit.Assert.assertEquals;
import java.time.LocalTime;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import components.Avio;
import components.Ruta;
import principal.Vol;

/**
 *
 * @author Xavi
 */
public class VolTest {
    
    private Vol vol;
    private Avio avio;
    private Ruta ruta;

    @Before
    public void setUp() {
        LocalTime time1 = LocalTime.parse("12:12");
        LocalTime time2 = LocalTime.parse("15:00");
        vol = new Vol("3", new Date(2019 - 04 - 25), new Date(2019 - 04 - 25), time1, time2);
        avio = new Avio("15", "Vueling", "Boeing A330", 300);
        vol.setAvio(avio);
    }

    @Test
    public void testGetCodi() {
        assertEquals("125", vol.getCodi());
    }

    @Test
    public void testGetRuta() {
        assertEquals(ruta, vol.getRuta());
    }

    @Test
    public void testGetAvio() {
        assertEquals(avio, vol.getAvio());
    }

    @Test
    public void testGetDataSortida() {
        Date result = new Date(2019 - 04 - 25);
        assertEquals(result, vol.getDataSortida());
    }

    @Test
    public void testGetDataArribada() {
        Date date = new Date(2019 - 04 - 25);
        assertEquals(date, vol.getDataArribada());
    }

    @Test
    public void testGetHoraSortida() {
        LocalTime result = LocalTime.parse("12:12");
        assertEquals(result, vol.getHoraSortida());

    }

    @Test
    public void testGetHoraArribada() {
        LocalTime result = LocalTime.parse("15:00");
        assertEquals(result, vol.getHoraArribada());
    }
}