package no.hvl.dat108.f02c;

import java.util.ArrayList;
import java.util.List;

public class Tallplukker {

	public static List<Integer> plukkUt(List<Integer> liste /*, ???*/) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(true /*???*/) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}
