package no.hvl.lph.dat108.f02c;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> listen = List.of(-4, 9, 2, 7, 6, 0);
		List<Integer> resultat;

		System.out.println("Listen:      " + listen);

		resultat = Tallplukker.plukkUt(listen, x -> x % 2 == 0); //Alle partall
		System.out.println("Partallene:  " + resultat);
		
		resultat = Tallplukker.plukkUt(listen, x -> x > 3); //Alle tall > 3
		System.out.println("Tallene > 3: " + resultat);
	}
}

