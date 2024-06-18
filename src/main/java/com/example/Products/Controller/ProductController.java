package com.example.Products.Controller;

import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Products.Dto.DtoProductsDetails;
import com.example.Products.Dto.ProductDto;
import com.example.Products.Entity.Product;
import com.example.Products.services.ProductServiceImp;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceImp productserviceimp;
	
	@PostMapping("/post")
	public Product create(@RequestBody ProductDto productdto) {
		return productserviceimp.create(productdto);
	}
	@GetMapping("/getalldetails")
	public List<DtoProductsDetails> getAny(@RequestParam(value="model",required = false) String model){
	return productserviceimp.getAny(model);
	}
	 @DeleteMapping("/delete/{id}")
	public String delete(@RequestBody Product product) {
		return productserviceimp.delete(product);
	}
	 @GetMapping("/getallproducts")
	    public Page<Product> getAllProducts(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "2") int size) {
	        return productserviceimp.getAllProducts(page, size);
}}