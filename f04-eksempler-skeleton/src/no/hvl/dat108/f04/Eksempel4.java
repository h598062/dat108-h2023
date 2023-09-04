package no.hvl.dat108.f04;
import static no.hvl.dat108.f04.People.people;

/*
 * Eksempel4
 * 
 * Vårt første stream()-eksempel.
 * Skrive ut alle med fornavn som begynner på "C".
 */
public class Eksempel4 {

	public static void main(String[] args) {

		// Skrive ut alle med fornavn som begynner på "C"

		// Gamlemåten:
		//		for (Person p : people) {
		//			if (p.getFirstName().startsWith("C")) {
		//				System.out.println(p);
		//			}
		//		}

		// Med streams:
		people.stream()
		      .filter(p -> p.getFirstName()
		                    .startsWith("C"))
		      .forEach(System.out::println);

	}
}














