package rpp2022backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rpp2022backend.model.Artikl;
import rpp2022backend.service.ArtiklService;

@RestController
public class ArtiklController {
	
	@Autowired
	private ArtiklService artiklService;
	
	/*
	* HTTP GET je jedna od HTTP metoda koja je analogna opciji READ iz CRUD operacija.
	* Anotacija @GetMapping se koristi kako bi se mapirao HTTP GET zahtev.
	* Predstavlja skraćenu verziju metode @RequestMapping(method = RequestMethod.GET)
	* U konkretnom slučaju HTTP GET zahtevi (a to je npr. svako učitavanje stranice u
	* browser-u) upućeni na adresu localhost:8083/artikl biće prosleđeni ovoj metodi.
	* 
	* Poziv metode artiklRepository.findAll() će vratiti kolekciju koja sadrži sve
	* artikala koji će potom u browseru biti prikazani u JSON formatu
	*/

	@GetMapping("artikl")
	public List<Artikl> getAll(){
		return artiklService.getAll();
	}

}
