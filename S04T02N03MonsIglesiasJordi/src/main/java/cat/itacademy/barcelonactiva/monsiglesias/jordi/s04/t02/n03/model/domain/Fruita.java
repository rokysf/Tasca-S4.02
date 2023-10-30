package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n03.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Document(collection = "fruites")
@Data
public class Fruita {
	@Id
	private Long id;
	private String nom;
	private int quantitatQuilos;
	
	
}

