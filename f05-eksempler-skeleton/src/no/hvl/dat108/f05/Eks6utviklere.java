package no.hvl.dat108.f05;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Eks6utviklere {
	
	public static void main(String[] args) throws Exception {
		
		List<Utvikler> utviklere = Arrays.asList(
				new Utvikler("Arne", Set.of("Java", "C")),
				new Utvikler("Pere", Set.of("Javascript", "C++")),
				new Utvikler("Knut", Set.of("Java")),
				new Utvikler("Anne", Set.of("Haskell", "C#", "Python")),
				new Utvikler("Emma", Set.of("Clojure", "Ruby", "C")),
				new Utvikler("Lise", Set.of("Java", "C")));

		System.out.println(
				"\nEn oversikt over hvilke utviklere som kan Java:");
//TODO		List<Utvikler> deSomKanJava = utviklere.stream()
//		deSomKanJava.forEach(System.out::println);
		
		System.out.println(
				"\nNavnet på en utvikler som kan C#, eller \"INGEN\" om ingen kan C#:");
//TODO		String navnCSharp = utviklere.stream()
//		System.out.println(navnCSharp);

		System.out.println(
				"\nEn sortert liste over alle programmeringsspråkene utviklerne kan:");
//TODO		List<String> spraak = utviklere.stream()
//		System.out.println(spraak);

		System.out.println(
				"\nHvilket språk flest utviklere kan (finner ett av dem):");
		//Litt vrien - Prøv selv ...
		
		System.out.println(
				"\nHvilke(t) språk flest utviklere kan hvis det er flere:");
		//Litt vrien - Prøv selv ...
	}
}





