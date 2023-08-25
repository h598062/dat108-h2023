package no.hvl.lph.dat108.f02b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
		List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
		Collections.sort(listen);
		System.out.println(listen);

		// 2. Sortere alfabetisk uavhengig av store og små bokstaver
		Collections.sort(listen, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		System.out.println(listen);

		// 3. ..., nå med lambda-uttrykk !!! :)
		Collections.sort(listen, (a, b) -> a.compareToIgnoreCase(b));
		System.out.println(listen);

		// 4. Sortere på lengden på strengene (med lambda-uttrykk)
		Collections.sort(listen, (a, b) -> a.length() - b.length());
		System.out.println(listen);

		// 5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
		lambda fun = (a, b) -> b.length() - a.length();
		Collections.sort(listen, fun);
		System.out.println(listen);
	}
}

interface lambda {
	int compare(String a, String b);
}

