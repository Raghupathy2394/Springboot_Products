package com.example.Products.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.Products.Dto.DtoProductsDetails;
import com.example.Products.Dto.ProductDto;
import com.example.Products.Entity.Product;
import com.example.Products.Repository.ProductRepository;

@Service
public class ProductService implements ProductServiceImp {

	@Autowired
	ProductRepository productRepo;

	@Override
	public Product create(ProductDto productdto) {
		Product entity=new Product();
		entity.setId(productdto.getId());
		entity.setModel(productdto.getModel());
		entity.setPrice(productdto.getPrice());
		entity.setProduct_name(productdto.getProduct_name());
		entity.setWarrenty(productdto.getWarrenty());
		entity.setDetails(productdto.getDetails());
		return productRepo.save(entity);
	}

	@Override
	public String delete(Product product) {
		productRepo.delete(product);
		return "deleted";
	}
	@Override
	public List<DtoProductsDetails> getAny(String model) {
		if(model==null) {
			return productRepo.findAllProducts();
		}else
		return productRepo.findBymodel(model);
	}


    public Page<Product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepo.findAll(pageable);

}


	}
