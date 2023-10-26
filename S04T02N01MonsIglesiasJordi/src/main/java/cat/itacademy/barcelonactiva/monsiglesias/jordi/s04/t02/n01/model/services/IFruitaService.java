package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.domain.Fruita;

public interface IFruitaService {
	
	Fruita createFruita(Fruita fruita);
	
	Optional<Fruita> getFruitaById(Long id);
	
	Fruita updateFruita(Fruita fruitaModificar);
	
	void deleteFruitaById(Long id);
	
	List<Fruita> getAllFruites();
	
	
	
	

}
