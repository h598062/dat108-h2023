package no.hvl.lph.dat108.f02c;

import java.util.ArrayList;
import java.util.List;

public class Tallplukker {

	public static List<Integer> plukkUt(
			List<Integer> liste, Betingelse<Integer> betingelse) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(betingelse.erOppfylt(tall)) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}
