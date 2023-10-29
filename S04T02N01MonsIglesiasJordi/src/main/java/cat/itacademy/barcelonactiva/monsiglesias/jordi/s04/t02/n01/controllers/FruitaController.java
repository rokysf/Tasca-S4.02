package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private FruitaService fruitaservice;
	
	@PostMapping("/add")
	public ResponseEntity<Fruita> createFruita(@RequestBody Fruita fruita) {
		fruitaservice.createFruita(fruita);
		return new ResponseEntity<Fruita>(fruita, HttpStatus.CREATED);
	}
	
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Fruita> getFruitaById(@PathVariable("id") Long id) {
		Optional<Fruita> fruitaGetOne = fruitaservice.getFruitaById(id);
		if(fruitaGetOne.isEmpty()) {
			return new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<Fruita>(fruitaGetOne.get(),HttpStatus.OK);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<Fruita> update(@RequestBody Fruita fruitaModificada) {
		Optional<Fruita> fruitaGetOne = fruitaservice.getFruitaById(fruitaModificada.getId());
		if(fruitaGetOne.isEmpty()) {
			return new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
		}else {
			fruitaservice.updateFruita(fruitaModificada);
			return new ResponseEntity<Fruita>(fruitaModificada, HttpStatus.OK);
		}
	}
		
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Fruita> deleteFruitaById(@PathVariable("id") Long id) {
		Optional<Fruita> fruitaGetOne = fruitaservice.getFruitaById(id);
		if(fruitaGetOne.isEmpty()) {
			return new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
		}else {
			fruitaservice.deleteFruitaById(id);
			return new ResponseEntity<Fruita>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Fruita>> getAllFruites(){
		if(fruitaservice.getAllFruites().size()==0) {
		return new ResponseEntity<List<Fruita>>(HttpStatus.NO_CONTENT);
		}else
		return new ResponseEntity<List<Fruita>>(fruitaservice.getAllFruites(), HttpStatus.OK);
		}
	}

