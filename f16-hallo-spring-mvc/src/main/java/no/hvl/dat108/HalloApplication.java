/*
 * Det er denne som kjøres når vi gjør Run As | Java Application.
 * 
 * Den starter opp en web-tjener på port 8080 der mappingene vi
 * har laget i controllerne er tilgjengelige og virker.
 */
package no.hvl.dat108;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HalloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HalloApplication.class, args);
	}

}
