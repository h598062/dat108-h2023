package no.hvl.dat108.f02a;

public class Person implements Comparable<Person> {
	
	private final String fornavn;
	private final String etternavn;
	private final int fodselsaar;

	public Person(String fornavn, String etternavn, int fodselsaar) {
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
	
	/* Ønsker standard sortering på etternavn */
	@Override
	public int compareTo(Person other) {
		return this.etternavn.compareTo((other.etternavn));
	}
}






