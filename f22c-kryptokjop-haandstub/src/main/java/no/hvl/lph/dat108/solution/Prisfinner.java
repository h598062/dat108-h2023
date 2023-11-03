package no.hvl.lph.dat108.solution;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public interface Prisfinner {
	Map<String, BigDecimal> finnPris(String fiatCode, String kryptoCode) throws IOException;
}
