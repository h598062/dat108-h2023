package no.hvl.dat108.f06d;

public class _RaceConditionMain {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * I dette eksempelet skal vi se at vi må beskytte delte ressurser
		 * mot potensiell samtidig oppdatering fra flere tråder ...
		 * 
		 * Vi skal se på den mest vanlige måten å gjøre dette på (det finnes flere). 
		 */
		
		final int N = 100000;
		
		Teller teller = new Teller();
		
		Thread telleOppTraad = new TelleOppTraad(teller, N);
		Thread telleNedTraad = new TelleNedTraad(teller, N);
		
		telleOppTraad.start();
		telleNedTraad.start();
		
		//Vente til begge trådene er ferdige
		telleOppTraad.join();
		telleNedTraad.join();
		
		System.out.println("Ferdig! Tellerverdi = " + teller.getVerdi());

	}

}
