package no.hvl.dat108.f04;

import static no.hvl.dat108.f04.People.people;

import java.util.Comparator;
import java.util.List;

/*
 * Eksempel2
 * 
*  I dette eksemplet ser vi hvordan vi kan erstatte 
*  (a,b) -> a.compareTo(b) med en metodereferanse.
*/
public class Eksempel2 {
	
	/** En variant av sorter som bruker a.compareTo(b) */
	private static <T extends Comparable<T>> void sorter(List<T> liste) {
		//sorter(liste, (a,b) -> a.compareTo(b));
		sorter(liste, Comparable::compareTo);
	}

	/** En variant av sorter som bruker s.sammenlign(a,b) */
	private static <T> void sorter(List<T> liste, Comparator<T> c) {
		
		for (int i=0; i<liste.size(); i++) {
			for (int j=1; j<liste.size(); j++) {
				T a = liste.get(j-1);
				T b = liste.get(j);
				
				if (c.compare(a, b) > 0) { 
					
					liste.set(j-1, b);
					liste.set(j, a);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		sorter(people);
		System.out.println("Sortert på etternavn ved å indirekte bruke T::compareTo");
		System.out.println(people);
		
		System.out.println("Sortert på fornavn ved å bruke en Comparator i kallet");
		sorter(people, (a,b) -> a.getFirstName().compareTo(b.getFirstName()));
		System.out.println(people);
	}
}

