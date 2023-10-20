package no.hvl.dat108;

import java.time.LocalDate;

public class Person {
	
	private String navn;
	private String mobil;
	private Integer hoydecm;
	private LocalDate fdato;

	//---------------------------------------------------------
	
	@Override
	public String toString() {
		return "Person [navn=" + navn + ", mobil=" + mobil 
				+ ", hoydecm=" + hoydecm + ", fdato=" + fdato + "]";
	}
	
	public String getNavn() {
		return navn;
	}
	public String getMobil() {
		return mobil;
	}
	public Integer getHoydecm() {
		return hoydecm;
	}
	public LocalDate getFdato() {
		return fdato;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public void setHoydecm(Integer hoydecm) {
		this.hoydecm = hoydecm;
	}

	public void setFdato(LocalDate fdato) {
		this.fdato = fdato;
	}
}
