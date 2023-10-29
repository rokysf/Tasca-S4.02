package cat.itacademy.barcelonactiva.monsiglesias.jordi.s04.t02.n02.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "fruites")
@Data

public class Fruita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private int quantitatQuilos;
	
	
}

