package no.hvl.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SjekkAarController {

	@GetMapping("/skjema")
	public String aarstallSkjema() {
		return "skjema";
	}

	@GetMapping("/sjekkAar")
	public String sjekkFodselsaar(@RequestParam String fodselsaar) {
		return "tilbakemelding";
	}
	
}
