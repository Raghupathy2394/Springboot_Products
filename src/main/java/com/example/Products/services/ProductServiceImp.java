package com.example.Products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.Products.Dto.DtoProductsDetails;
import com.example.Products.Dto.ProductDto;
import com.example.Products.Entity.Product;

public interface ProductServiceImp {

	Product create(ProductDto productdto);

	String delete(Product product);

	List<DtoProductsDetails> getAny(String model);


	Page<Product> getAllProducts(int page, int size);

}
