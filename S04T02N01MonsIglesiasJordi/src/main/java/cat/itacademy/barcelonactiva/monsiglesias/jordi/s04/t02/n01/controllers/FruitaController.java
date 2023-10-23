package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
public class FruitaController {
	
	FruitaService fruitaservice;
	
	@PostMapping
	public ResponseEntity saveFruita(@RequestBody Fruita fruita) {
		
		return new ResponseEntity(fruitaservice.saveFruita(fruita), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity obtenirFruita(@PathVariable("id") Long id) {
		
		return new ResponseEntity(fruitaservice.obtenirFruita(id), HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity modificarFruita(@PathVariable("id") Long id, @RequestBody Fruita fruita) {
		
		return new ResponseEntity(fruitaservice.modificarFruita(id, fruita), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity eliminarFruita(@PathVariable("id") Long id) {
		boolean resposta = fruitaservice.eliminarFruita(id);
		if(resposta) {
			return new ResponseEntity(HttpStatus.OK);
		}else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	
	}
}
