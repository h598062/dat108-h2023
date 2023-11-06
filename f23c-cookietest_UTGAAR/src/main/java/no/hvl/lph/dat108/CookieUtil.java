package no.hvl.lph.dat108;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtil {

	//Denne kan være aktuell å ha som hjelpemetode!
	public static void addCookieToResponse(HttpServletResponse response, String navn, String verdi) {
		try {
			Cookie cookie = new Cookie(navn, URLEncoder.encode(verdi, "UTF-8"));
			cookie.setMaxAge(30); // 30 sekunder
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	//Denne er IKKE så aktuell med Spring MVC. Da kan man i stedet gjøre
	//@CookieValue(name="...", required=false) String ... i controlleren.
	//Det eneste må være decoding.
	//Kanskje sesjonshåndtering og innlogging hadde vært et bedre eksempel?
	public static String getCookieFromRequest(HttpServletRequest request, String navn) {
		String verdi = null;
		try {
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals(navn)) {
						verdi = URLDecoder.decode(cookie.getValue(), "UTF-8");
					}
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return verdi;
	}
}
