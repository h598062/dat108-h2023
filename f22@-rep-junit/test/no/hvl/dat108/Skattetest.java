package no.hvl.dat108;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Skattetest {
	
	//Skattekalkulator.beregnSkatt(0);
	@Test
	public void negativInntekt() {
		Exception e = assertThrows(IllegalArgumentException.class,
				() -> Skattekalkulator.beregnSkatt(11_000_000));
	}
	
	@Test
	public void deUtenSkatt() {
		assertEquals(0, Skattekalkulator.beregnSkatt(0));
		assertEquals(0, Skattekalkulator.beregnSkatt(50_000));
	}
	

}
