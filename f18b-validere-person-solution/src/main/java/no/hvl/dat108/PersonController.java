package no.hvl.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.validation.Valid;

@Controller
public class PersonController {

	@GetMapping("/personskjema")
	public String personskjema() {
		return "personskjema";
	}
	
	@GetMapping("/sjekkPerson")
	public String sjekkPerson(
			@Valid @ModelAttribute("person") Person person, 
			BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			
			//Vil samle opp alle feilmeldinger opp i en string.
			//Mer om løkker i jsp-filer senere (da kunne vi sendt en liste)
			String feilmeldinger = bindingResult.getAllErrors().stream()
					.map(e -> e.getDefaultMessage())
					.reduce("", (f, e) -> f + e + "<br>");
			
			model.addAttribute("feilmeldinger", feilmeldinger);
			return "personskjema";
		}
		return "personkvittering";
	}

}
