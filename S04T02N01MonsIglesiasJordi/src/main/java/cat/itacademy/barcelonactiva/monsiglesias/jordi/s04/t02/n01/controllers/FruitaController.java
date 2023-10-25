package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.controllers;

import java.util.List;

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
	public Fruita createFruita(@RequestBody Fruita fruita) {
		return fruitaservice.createFruita(fruita); //HttpStatus.CREATED);
	}
	
	@GetMapping("/getOne/{id}")
	public Fruita getFruitaById(@PathVariable("id") Long id) {
		return fruitaservice.getFruitaById(id); //HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public Fruita updateFruitaById(@PathVariable("id") Long id, @RequestBody Fruita fruita) {
		
		return fruitaservice.updateFruitaById(id, fruita); //HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteFruitaById(@PathVariable("id") Long id) {
		fruitaservice.deleteFruitaById(id);
		
		/*boolean resposta = fruitaservice.eliminarFruita(id);
		if(resposta) {
			return new ResponseEntity(HttpStatus.OK);
		}else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}*/
	
	}
	
	@GetMapping("/getAll")
	public List<Fruita> getAllFruites(){
		return fruitaservice.getAllFruites();
	}
	
}
