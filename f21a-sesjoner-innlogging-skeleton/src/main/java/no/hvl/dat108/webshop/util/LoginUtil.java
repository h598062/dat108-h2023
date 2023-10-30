package no.hvl.dat108.webshop.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class LoginUtil {
	
	public static void loggUtBruker(HttpSession session) {
	}

	public static void loggInnBruker(HttpServletRequest request, String username) {
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
		return false;
	}

}
