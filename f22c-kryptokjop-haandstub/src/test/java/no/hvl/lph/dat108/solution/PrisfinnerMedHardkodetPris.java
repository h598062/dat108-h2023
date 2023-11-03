package no.hvl.lph.dat108.solution;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public class PrisfinnerMedHardkodetPris implements Prisfinner {

	/* Returnerer alltid en kryptokurs på 1234567.89 */
	@Override
	public Map<String, BigDecimal> finnPris(String fiatCode, String kryptoCode) throws IOException {
		return Map.of(kryptoCode, new BigDecimal("1234567.89"));
	}
	
	
}