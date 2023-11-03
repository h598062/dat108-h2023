package no.hvl.dat108;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Person {
	
    @NotNull
    @Size(min=2, max=10, message="Navn må være mellom 2 og 10 tegn")
    @Pattern (regexp="^[A-Za-zÆØÅæøå]*$") //Kun (0:n) bokstaver
	private String navn;
	
    @NotNull
    @Min(value=1900, message="Fødselsår kan ikke være før år 1900")
    @Max(value=2022, message="Fødselsår kan ikke være etter år 2022")
	private int fodselsaar;

	public Person(String navn, int fodselsaar) {
		this.navn = navn;
		this.fodselsaar = fodselsaar;
	}
}
