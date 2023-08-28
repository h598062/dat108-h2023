package no.hvl.dat108.f02a;

import java.util.Arrays;
import java.util.List;

// Bruke lambda-uttrykk der det er mulig !!

public class Main {
	
	public static void main(String[] args) {
		
		//1. Sortere liste av heltall. OK
		List<Integer> listeAvTall = Arrays.asList(4,2,7,5,9,1);
		Boblesortering.sorter(listeAvTall);
		System.out.println("Sortert listeAvTall: " + listeAvTall);
		
				
		//2. Sortere liste av strenger. 
		List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
		Boblesortering.sorter(listeAvString);
		System.out.println("Sortert listeAvString: " + listeAvString);
		
		
		//3. Sortere liste av personer på etternavn.
		List<Person> listeAvPersoner = Arrays.asList(
				new Person("Anne", "Persen", 1985),
				new Person("Per", "Andersen", 1984),
				new Person("Knut", "Svensen", 1990));
		Boblesortering.sorter(listeAvPersoner);
		System.out.println("Sortert på etternavn: " + listeAvPersoner);
		
		
		class FornavnSammenligner implements Sammenligner<Person> {
			@Override
			public int sammenlign(Person a, Person b) {
				return a.getFornavn().compareTo(b.getFornavn());
			}
		}
		
		//4. Ønsker å sortere på fornavn. Hva gjør vi?
		Boblesortering.sorter(listeAvPersoner, new FornavnSammenligner());
		System.out.println("Sortert på fornavn:   " + listeAvPersoner);
		
		
		//5. Ønsker å sortere på fødselsår. Hva gjør vi?
		Boblesortering.sorter(listeAvPersoner, new Sammenligner<Person>() {
			@Override
			public int sammenlign(Person a, Person b) {
				return a.getFodselsaar() - b.getFodselsaar();
			}
		});
		System.out.println("Sortert på fødselsår: " + listeAvPersoner);
		
	}
}




