package com.example.Products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Products.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
