package no.hvl.lph.dat108.f02a;

/* Bruk denne om du ikke er komfortabel med record Person */
public class PersonClassOldStyle implements Comparable<PersonClassOldStyle> {
	
	private final String fornavn;
	private final String etternavn;
	private final int fodselsaar;

	public PersonClassOldStyle(String fornavn, String etternavn, int fodselsaar) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fodselsaar = fodselsaar;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public int getFodselsaar() {
		return fodselsaar;
	}

	@Override
	public String toString() {
		return "["+ fornavn + ", " + etternavn + ", " + fodselsaar + "]";
	}
	
	@Override
	public int compareTo(PersonClassOldStyle other) {
		return this.etternavn.compareTo((other.etternavn));
	}
}






