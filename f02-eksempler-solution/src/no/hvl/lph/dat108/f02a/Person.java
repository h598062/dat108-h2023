package no.hvl.lph.dat108.f02a;

/*
 * Ny konstruksjon record f.o.m. Java 16 :)
 * 
 * Forenkler skriving av, og kan brukes som en vanlig (immutable) Person-klasse. 
 * 
 * Se f.eks. https://zetcode.com/java/record/ for litt mer info om record.
 * Ellers fin forklaring på video: https://www.youtube.com/watch?v=gJ9DYC-jswo
 * 
 * Det vi får gratis ved å bruke record i stedet for class er:
 * - Private final instansvariabler tilsvarende de som er listet opp i def.
 * - Parametrisk konstruktør tilsvarende def.
 * - "gettere" kalt fornavn(), etternavn() og fodselsaar()
 * - equals() og hashCode() basert på dataene 
 * - toString() basert på dataene
 * 
 * Vi kan la en record implementere interfaces og legge til ekstra
 * konstruktører og metoder hvis det er ønskelig. Her har vi lagt til at en
 * Person implements Comparable<Person> og fikset litt på toString().
 */
public record Person(String fornavn, String etternavn, int fodselsaar)	
		implements Comparable<Person> {

	/* Ønsker en litt forenklet toString() */
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


