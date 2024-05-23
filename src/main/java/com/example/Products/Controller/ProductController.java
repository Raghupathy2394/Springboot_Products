package com.example.Products.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.Products.Entity.Product;
import com.example.Products.services.ProductServiceImp;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceImp productserviceimp;
	
	@PostMapping("/post")
	public Product create(@RequestBody Product product) {
		return productserviceimp.create(product);
	}
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return productserviceimp.update(product);
	}
	@GetMapping("/get/{id}")
	public  Optional<Product> getdetails(@PathVariable int id) {
		return  productserviceimp.getdetails(id);
	} @GetMapping("/getall")
	public List<Product> getall(){
		return productserviceimp.getall();
	} @DeleteMapping("/delete/{id}")
	public String delete(@RequestBody Product product) {
		return productserviceimp.delete(product);
	}
}
