package no.hvl.lph.dat108;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BesokController {

	@GetMapping("/besok")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Sjekk om cookie er med i request
		String besokCookie = CookieUtil.getCookieFromRequest(request, "besokt");

		// Sende med cookie uansett om den finnes eller ikke
		CookieUtil.addCookieToResponse(response, "besokt", "dggdfgjfjfj");

		PrintWriter out = response.getWriter();

		if (besokCookie != null) {
			out.println("Velkommen tilbake. Du har vært på siden tidligere!");

		} else {
			out.println("Hei du ukjente bruker!");
		}
	}

}
