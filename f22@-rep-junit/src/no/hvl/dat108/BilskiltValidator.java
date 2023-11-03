package no.hvl.dat108;

public class BilskiltValidator {
	
	
	/*
	 * Et gyldig skilt er 2 store bokstaver A..Z og deretter 5 siffer.
	 */
	public static boolean erGyldigSkilt(String skilt) {
		
		String skiltmonster = "^[A-Z]{2}\\d{5}$";
		return skilt != null && skilt.matches(skiltmonster);
	}

}
