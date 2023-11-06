package no.hvl.dat108;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BilskiltValidatorTest {
	
	@Test
	public void dfsf() {
		assertTrue(BilskiltValidator.erGyldigSkilt("AB12345"));
	}

	@Test
	public void sgfdsg() {
		assertFalse(BilskiltValidator.erGyldigSkilt("AB 12345"));
	}

	@Test
	public void sgdffdsg() {
		assertFalse(BilskiltValidator.erGyldigSkilt("AB"));
	}
	
	@Test
	public void sddsf() {
		assertFalse(BilskiltValidator.erGyldigSkilt(null));
	}

}
	