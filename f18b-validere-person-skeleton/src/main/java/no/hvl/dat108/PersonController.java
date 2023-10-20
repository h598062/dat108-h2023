package no.hvl.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/personskjema")
	public String personskjema() {
		return "personskjema";
	}
	
	@GetMapping("/sjekkPerson")
	public String sjekkPerson() {
		return "personkvittering";
	}

}
