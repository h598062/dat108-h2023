package no.hvl.dat108.f02c;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		var listen = List.of(-4, 9, 2, 7, 6, 0);
		System.out.println("Listen:      " + listen);

		List<Integer> resultat = null;
		
		//1. Plukk ut og returner alle partall
		//resultat = Tallplukker.plukkUt(listen, ???);
		System.out.println("Partallene:  " + resultat);
		
		//2. Plukk ut og returner alle tall større enn 3
		//resultat = Tallplukker.plukkUt(listen, ???);
		System.out.println("Tallene > 3: " + resultat);

		//3. Plukk ut og returner alle tall større enn 6
		//resultat = Tallplukker.plukkUt(listen, ???);
		System.out.println("Tallene > 6: " + resultat);

		//4. Plukk ut og returner alle tall større enn 8
		//resultat = Tallplukker.plukkUt(listen, ???);
		System.out.println("Tallene > 8: " + resultat);

	}
}

