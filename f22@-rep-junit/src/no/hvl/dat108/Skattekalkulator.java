package no.hvl.dat108;

public class Skattekalkulator {
	
	/*
	 * Skattebergning skal virke slik:
	 * - Gyldig årsinntekt er [0,10_000_000]
	 * - Ved ugyldig kastes et IllegalArgumentException
	 * - Det er skattefritak opp til 50_000
	 * - Deretter er det 30% skatt opp til 650_000
	 * - Alt over dette skattes med 50%
	 */
	public static int beregnSkatt(int aarsinntekt) {
		
		if (aarsinntekt < 0 || aarsinntekt > 10_000_000) {
			throw new IllegalArgumentException("Ugyldig inntekt");
		}
		if (aarsinntekt <= 50000) {
			return 0;
		}
		if (aarsinntekt <= 650_000) {
			return (int)(0.3 * (aarsinntekt - 50_000));
		}
		return (int)(0.5 * (aarsinntekt - 650_000) + 180_000);
	}
}
