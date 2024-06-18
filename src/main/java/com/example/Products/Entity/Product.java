package com.example.Products.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;

	private String product_name;
	
	private String model;
	
	private String warrenty;
	
	private int price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fkp_id",referencedColumnName = "id")
	private List<DetailsProduct> details;
	 }
