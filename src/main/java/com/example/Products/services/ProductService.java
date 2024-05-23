package com.example.Products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Products.Entity.Product;
import com.example.Products.Repository.ProductRepository;

@Service
public class ProductService implements ProductServiceImp {

	@Autowired
	ProductRepository productRepo;

	@Override
	public Product create(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product update(Product product) {
		Optional<Product> product1 = productRepo.findById(product.getId());
		Product product2 = product1.get();
		product2.setId(product.getId());
		product2.setProduct_name(product.getProduct_name());
		product2.setPrice(product.getPrice());
		return productRepo.save(product);
	}

	@Override
	public Optional<Product> getdetails(int id) {

		return productRepo.findById(id);
	}

	@Override
	public List<Product> getall() {
		return productRepo.findAll();
	}

	@Override
	public String delete(Product product) {
		productRepo.delete(product);
		return "deleted";
	}
}
