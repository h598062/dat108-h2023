package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

import java.util.Optional;
import java.util.stream.IntStream;

public class Eks4Optional2 {

	public static void main(String[] args) {

		//Det minste tallet i intervallet [1,100]
		//Stream-APIet tar automatisk hensyn til at input-stream kan være tom
		//slik at det ikke er noen minste. Pakker inn i Optional.
		int minste = IntStream.rangeClosed(1, 100).min().orElse(-1000);
		System.out.println(minste);
		
		//Finn en i people-listen som er 30 eller yngre
		//Stream-APIet tar automatisk hensyn til at input-stream kan være tom
		//slik at det ikke er noen minste. Pakker inn i Optional.
		Optional<Person> optP = people.stream()
				.filter(p -> p.getAge() <= 30)
				.findAny();
		System.out.println(optP);
		optP.ifPresent(System.out::println);
		
	}

}




