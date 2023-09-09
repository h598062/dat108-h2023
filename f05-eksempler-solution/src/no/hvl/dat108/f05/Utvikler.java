package no.hvl.dat108.f05;

import java.util.Set;

public class Utvikler {
	
	private final String navn;
	private final Set<String> spraak;
	
	public Utvikler(String navn, Set<String> spraak) {
		this.navn = navn;
		this.spraak = spraak;
	}

	public String getNavn() {
		return navn;
	}

	public Set<String> getSpraak() {
		return spraak;
	}

	@Override
	public String toString() {
		return "Utvikler [navn=" + navn + ", spraak=" + spraak + "]";
	}
	
	

}
