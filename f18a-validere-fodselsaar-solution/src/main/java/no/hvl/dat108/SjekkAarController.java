package no.hvl.dat108;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SjekkAarController {

	@GetMapping("/skjema")
	public String aarstallSkjema() {
		return "skjema";
	}

	@GetMapping("/sjekkAar")
	public String sjekkFodselsaar(
			@RequestParam(required = false) String fodselsaar,
			Model model) {
		
		System.err.println("fodselsaar = " + fodselsaar);
		
		boolean gyldig = InputValidator.erGyldigAarstall(fodselsaar);
		model.addAttribute("gyldig", gyldig);
		
		if (!gyldig) {
			model.addAttribute("feilmelding", 
					"Ugyldig årstall. Må være et tall mellom 1900 og " 
					+ LocalDate.now().getYear());
			return "skjema";
		}
		return "tilbakemelding";
	}
	
}
