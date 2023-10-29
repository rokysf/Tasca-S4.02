package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n03.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n03.model.domain.Fruita;


@Repository
public interface FruitaRepository extends MongoRepository<Fruita, Long>{
	
}
