package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.repository.FruitaRepository;


@Service
public class FruitaService implements IFruitaService{

	@Autowired
	FruitaRepository fruitarepository;
	
	@Override
	public Fruita saveFruita(Fruita fruita) {
		return fruitarepository.save(fruita);
	}

	@Override
	public Optional<Fruita> obtenirFruita(Long id) {
		return fruitarepository.findById(id);
	}

	@Override
	public Fruita modificarFruita(Long id, Fruita fruitaModificar) {
		Fruita fruitaBuscada = fruitarepository.findById(id).get();
		fruitaBuscada.setNom(fruitaModificar.getNom());
		fruitaBuscada.setQuantitatQuilos(fruitaModificar.getQuantitatQuilos());
		return fruitarepository.save(fruitaBuscada);
	}

	@Override
	public boolean eliminarFruita(Long id) {
		try {
			fruitarepository.deleteById(id);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
