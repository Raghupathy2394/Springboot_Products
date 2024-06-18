package com.example.Products.Dto;

import java.util.List;

import com.example.Products.Entity.DetailsProduct;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String product_name;
	
	private String model;
	
	private String warrenty;
	
	private int price;
	
	private List<DetailsProduct> details;
}
