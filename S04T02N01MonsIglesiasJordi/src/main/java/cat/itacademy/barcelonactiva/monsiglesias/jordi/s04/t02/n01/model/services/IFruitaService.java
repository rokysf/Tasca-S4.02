package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.services;

import java.util.Optional;

import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.domain.Fruita;

public interface IFruitaService {
	
	Fruita saveFruita(Fruita fruita);
	
	Optional<Fruita> obtenirFruita(Long id);
	
	Fruita modificarFruita(Long id, Fruita fruita);
	
	boolean eliminarFruita(Long id);
	
	
	
	

}
