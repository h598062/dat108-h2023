package no.hvl.dat108.f05;

import java.util.List;
import java.util.Optional;

/*
 * Sjekke: https://www.baeldung.com/java-optional , avsnitt 1-9.
 * , men denne går deretter ganske mye lenger enn planlagt "pensum".
 */

public class Eks3Optional1 {
	
	/** Metode som finner minste tall i listen større enn 10. 
	 *  Returnerer null om ingen er funnet.
	 */
	private static Integer finnMinsteOver10(List<Integer> liste) {
		Integer minste = null;
		for (int tall : liste) {
			if (tall > 10 && (minste == null || tall < minste)) {
				minste = tall;
			}
		}
		return minste;
	}

	
	public static void main(String[] args) {

		List<Integer> enToTre = List.of(1, 2, 3);
		List<Integer> tiElleveTolv = List.of(10, 11, 12);

		//Først uten Optional. Må da gjøre en if-else for de to ulike tilfellene
		
		Integer resultatEnToTre = finnMinsteOver10(enToTre);
		if (resultatEnToTre != null) {
			printFunnet(enToTre, resultatEnToTre);
		} else {
			printIkkeFunnet(enToTre);
		}

		Integer resultatTiElleveTolv = finnMinsteOver10(tiElleveTolv);
		if (resultatTiElleveTolv != null) {
			printFunnet(tiElleveTolv, resultatTiElleveTolv);
		} else {
			printIkkeFunnet(tiElleveTolv);
		}
		
		System.out.println();
		//Så med Optional. kan da bruke ifPresentOrElse(Consumer, Runnable)
		//for å få samme resultat
		
		Optional<Integer> a = finnMinsteOver10Opt(enToTre);
		a.ifPresentOrElse(
				x -> printFunnet(enToTre, x),
				() -> printIkkeFunnet(enToTre));
		
		Optional<Integer> b = finnMinsteOver10Opt(tiElleveTolv);
		b.ifPresentOrElse(
				x -> printFunnet(tiElleveTolv, x),
				() -> printIkkeFunnet(tiElleveTolv));

		//Andre muligheter med Optional.
		
		System.out.println("\nifPresent(...)");
		a.ifPresent(System.out::println);
		b.ifPresent(System.out::println);
		
		System.out.println("\norElse(0)");
		System.out.println(a.orElse(-1));
		System.out.println(b.orElse(-1));

		System.out.println("\norElseThrow(...)");
//		System.out.println(a.orElseThrow(() -> new RuntimeException()));
		System.out.println(b.orElseThrow(() -> new RuntimeException()));
		
		System.out.println("\nget()");
//		System.out.println(a.get()); //Vil kaste en  java.util.NoSuchElementException siden empty
		System.out.println(b.get());
	}
	
	/** Metode som finner minste tall i listen større enn 10. 
	 *  Returnerer Optional.empty om ingen er funnet.
	 */
	private static Optional<Integer> finnMinsteOver10Opt(List<Integer> liste) {
		return Optional.ofNullable(finnMinsteOver10(liste));
	}

	/** Hjelpemetode for utskrift */
	private static void printFunnet(List<Integer> liste, Integer tall) {
		System.out.println("Minste tall over 10 i " + liste + ": " + tall);
	}

	/** Hjelpemetode for utskrift */
	private static void printIkkeFunnet(List<Integer> liste) {
		System.out.println("Minste tall over 10 i " + liste + " ikke funnet!");
	}

	

}
















