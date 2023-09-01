package no.hvl.dat108.f02a;

/* Ny mulighet f.o.m. Java16: record - En forenklet måte å lage en dataklasse
 * Absolutt noe å se på for de som er interessert.
 */
public record PersonRecord(String fornavn, String etternavn, int fodselsaar)	
		implements Comparable<PersonRecord> {

	/* Hvis vi ønsker en litt forenklet toString() ift. den genererte */
	@Override
	public String toString() {
		return "["+ fornavn + ", " + etternavn + ", " + fodselsaar + "]";
	}
	
	/* Vi ønsker standard sortering på etternavn */
	@Override
	public int compareTo(PersonRecord other) {
		return this.etternavn.compareTo((other.etternavn));
	}
}


