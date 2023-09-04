package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks1reduce {

	public static void main(String[] args) {

		/* Summen av aldre av personer i people-listen */

		// Summen av aldre med vanlig +
		int sumAlder1 = people.stream()
		                      .map(Person::getAge)
		                      .reduce(0, (sum, alder) -> sum + alder);

		// Alternativt med Integer.sum
		int sumAlder2 = people.stream()
		                      .map(Person::getAge)
		                      .reduce(0, (akk, alder) -> Integer.sum(akk, alder));

		// Med metodereferanse
		int sumAlder3 = people.stream()
		                      .map(Person::getAge)
		                      .reduce(0, Integer::sum);

		// Alternativt med IntStream (Stream av int)
		int sumAlder4 = people.stream()
		                      .mapToInt(Person::getAge)
		                      .sum();

		System.out.println(sumAlder1 + " " + sumAlder2 + " " + sumAlder3 + " " + sumAlder4);


		/* En streng med alle initialene, "CD LC TC CB MA" */

		// Samle opp med reduce og +
		String initialer1 = people.stream()
		                          .map(p -> "" + p.getFirstName()
		                                          .charAt(0))
		                          .reduce("", (res, c) -> res + " " + c);

		// Fjerne ende-spaces med trim 
		String initialer2 = people.stream()
		                          .map(p -> "" + p.getFirstName()
		                                          .charAt(0))
		                          .reduce("", (res, c) -> res + " " + c)
		                          .trim();


		// Alternativt med collect og Collectors.joining
		String initialer3 = "";

		System.out.println("|" + initialer1 + "|");
		System.out.println("|" + initialer2 + "|");
		System.out.println("|" + initialer3 + "|");
	}

}










