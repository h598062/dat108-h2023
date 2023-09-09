package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

import java.util.stream.Collectors;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldre av personer i people-listen */

		// Summen av aldre
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (sum, e) -> sum + e);
//		System.out.println(sumAlder);
		
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (akk, e) -> Integer.sum(akk, e));
//		System.out.println(sumAlder);
		
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, Integer::sum);
//		System.out.println(sumAlder);
		
		int sumAlder = people.stream().mapToInt(Person::getAge).sum();
		System.out.println(sumAlder);
		
		// En streng med alle initialene, "CD LC TC CB MA"

//		String initialer = people.stream()
//				.map(p -> "" + p.getFirstName().charAt(0) + p.getLastName().charAt(0))
//				.reduce("", (res, p) -> res + " " + p).trim();

		String initialer = people.stream()
				.map(p -> "" + p.getFirstName().charAt(0) + p.getLastName().charAt(0))
				.collect(Collectors.joining(" "));

		System.out.println("|" + initialer + "|");
		
	}	

}










