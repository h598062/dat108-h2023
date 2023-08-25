package no.hvl.lph.dat108.f02a;

import java.util.List;

public class Boblesortering {

	//Den "gamle" metoden, nå som et kall til den nye for å slippe duplikatkode
	//Alternativt kunne man gitt null som 2.parameter og testet på dette i den andre.
	public static <T extends Comparable<T>> void sorter(List<T> liste) {
		
		sorter(liste, new Sammenligner<T>() {
			@Override
			public int sammenlign(T a, T b) {
				return a.compareTo(b);
			}
		});
	}

	//Den nye metoden med en ekstra Sammenligner-parameter
	public static <T extends Comparable<T>> void sorter(List<T> liste, Sammenligner<T> s) {
		
		for (int i=0; i<liste.size(); i++) {
			for (int j=1; j<liste.size(); j++) {
				T a = liste.get(j-1);
				T b = liste.get(j);
				if (s.sammenlign(a,b) > 0) { //Dette er den sentrale linjen
					liste.set(j-1, b);
					liste.set(j, a);
				}
			}
		}
	}
}
