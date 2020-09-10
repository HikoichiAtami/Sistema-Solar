package com.edutecno.SolarSystem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Entidades.Planeta;
import Planetas.Planetas;
import Planetas.Planetas.Planets;


/**
 * Unit test for simple App.
 */
public class SolarSystemTest {

	/**
     * Rigorous Test :-)
     */
	@Test
	public void testPlanetas() {
		Planeta planeta = new Planeta();
		Planetas mundo = new Planetas();
		planeta = mundo.solarSystem(Planets.Júpiter);
		assertEquals(planeta.getLuna().size(),2);
		assertTrue(planeta.getNombre().equals("Júpiter"));
		assertTrue(planeta.getLuna().get(0).getNombre().equals("Adrastea"));
		assertTrue(planeta.getLuna().get(1).getNombre().equals("Callisto"));
		
	}
}
