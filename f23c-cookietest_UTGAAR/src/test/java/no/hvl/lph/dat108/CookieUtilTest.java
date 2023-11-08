package no.hvl.lph.dat108;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import jakarta.servlet.http.Cookie;

public class CookieUtilTest {

    private MockHttpServletRequest mockRequest;
    private MockHttpServletResponse mockResponse;
    
    @BeforeEach
    public void setup() {
        mockRequest = new MockHttpServletRequest();
        mockResponse = new MockHttpServletResponse();
    }
    
    @Test
    public void cookieSkalKunneHentesUtDekodetFraRequest() {
        
        //Arrange
        mockRequest.setCookies(new Cookie[]{new Cookie("User", "Atle+Patle")});
        //Act
        String cookie = CookieUtil.getCookieFromRequest(mockRequest, "User");
        //Assert
        assertEquals("Atle Patle", cookie);
    }
    
    @Test
    public void cookieBlirLagretKodetOgTidsmerket() {
        
        //Act
    	CookieUtil.addCookieToResponse(mockResponse, "User", "Atle Patle");
        //Assert
        Cookie cookie = mockResponse.getCookies()[0];
        assertEquals("User", cookie.getName());
        assertEquals("Atle+Patle", cookie.getValue());
        //assertEquals(30, cookie.getMaxAge());
    }

}
