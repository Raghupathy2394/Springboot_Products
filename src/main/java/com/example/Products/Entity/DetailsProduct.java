package com.example.Products.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class DetailsProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	
	private String ram;
	
	private String rom;
	
	private String battery;
	
	
}
