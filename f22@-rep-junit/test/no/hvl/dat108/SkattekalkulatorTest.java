package no.hvl.dat108;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SkattekalkulatorTest {
	
	/*
	 * Skattebergning skal virke slik:
	 * - Gyldig årsinntekt er [0,10_000_000]
	 * - Ved ugyldig kastes et IllegalArgumentException
	 * - Det er skattefritak opp til 50_000
	 * - Deretter er det 30% skatt opp til 650_000
	 * - Alt over dette skattes med 50%
	 */
	
	@Test
	public void gyldige() {
		assertEquals(0, Skattekalkulator.beregnSkatt(0));
		assertEquals(0, Skattekalkulator.beregnSkatt(50_000));
		assertEquals(3_000, Skattekalkulator.beregnSkatt(60_000));
		assertEquals(165_000, Skattekalkulator.beregnSkatt(600_000));
		assertEquals(355_000, Skattekalkulator.beregnSkatt(1_000_000));
	}
	
	@Test
	public void negativInntekt() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			Skattekalkulator.beregnSkatt(-1);
		});
		assertEquals("Ugyldig inntekt", e.getMessage());
	}

}
