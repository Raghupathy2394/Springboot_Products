package com.example.Products.services;

import java.util.List;
import java.util.Optional;

import com.example.Products.Entity.Product;

public interface ProductServiceImp {

	Product create(Product product);

	Product update(Product product);

	Optional<Product> getdetails(int id);

	List<Product> getall();

	String delete(Product product);

}
