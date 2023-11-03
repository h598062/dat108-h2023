package no.hvl.lph.dat108.problem;

import java.io.IOException;

import org.springframework.stereotype.Service;

import no.hvl.lph.dat108.Fiat;
import no.hvl.lph.dat108.Krypto;

@Service
public class KryptoCalkulator {
	
	public double kjope(double antall, Krypto krypto, Fiat fiat) {
		try {
			return antall * PrisFinderKucoin.finnPris(
					fiat.name(), krypto.name())
					.get(krypto.name()).doubleValue();
			
		} catch (IOException e) {
			return -1;
		}
	}
}
