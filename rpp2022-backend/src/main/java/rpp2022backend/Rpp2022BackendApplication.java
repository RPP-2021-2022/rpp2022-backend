package rpp2022backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication - anotacija se postavlja na klasi koja će se koristiti
 * za pokretanje aplikacije. Klasa koja pokreće aplikaciju mora se nalaziti u
 * osnovnom paketu. Predstavlja kobinaciju anotacija @Configuration, @EnableAutoConfiguration i
 * @ComponentScan
 * @Configuration - anotacija koja označava klasu koja definiše Spring Bean-ove. 
 * @EnableAutoConfiguration - anotacija koja označava klasu koje će kreirati Spring Bean-ove i
 * inicijalizovati različita druga podešavanja
 * @ComponentScan - anotacija koja označava gde će se tražiti klase, metode ili varijable instanci
 * koje imaju anotacije
 *  */

@SpringBootApplication
public class Rpp2022BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rpp2022BackendApplication.class, args);
	}

}
