package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n02.model.services;

import java.util.List;
import java.util.Optional;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n02.model.domain.Fruita;

public interface IFruitaService {
	
	Fruita createFruita(Fruita fruita);
	
	Optional<Fruita> getFruitaById(Long id);
	
	Fruita updateFruita(Fruita fruitaModificada);
	
	void deleteFruitaById(Long id);
	
	List<Fruita> getAllFruites();
	
	
	
	

}
