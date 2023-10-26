package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n01.model.repository.FruitaRepository;


@Service
public class FruitaService implements IFruitaService{

	@Autowired
	private FruitaRepository fruitarepository;
	
	@Override
	public Fruita createFruita(Fruita fruita) {
		return fruitarepository.save(fruita);
	}

	@Override
	public Optional<Fruita> getFruitaById(Long id) {
		Optional<Fruita> optionalFruita = fruitarepository.findById(id);
		return optionalFruita;
		
	}

	@Override
	public Fruita updateFruita(Fruita fruitaModificar) {
		Fruita fruitaBuscada = fruitarepository.findById(id);
		fruitaBuscada.setNom(fruitaModificar.getNom());
		fruitaBuscada.setQuantitatQuilos(fruitaModificar.getQuantitatQuilos());
		return fruitarepository.save(fruitaBuscada);
	}

	@Override
	public void deleteFruitaById(Long id) {
		fruitarepository.deleteById(id);
	}

	public List<Fruita> getAllFruites(){
		return fruitarepository.findAll();
	}
}
