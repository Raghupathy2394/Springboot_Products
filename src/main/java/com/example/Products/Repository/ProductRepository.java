package com.example.Products.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Products.Dto.DtoProductsDetails;
import com.example.Products.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	@Query(value="select p.id as id, p.product_name as productname, p.model as model, p.warrenty as warrenty, "
			+ "p.price as price, d.ram as ram, d.rom as rom, d.battery as battery "
			+ "from product p inner join details_product d on p.id=d.fkp_id",nativeQuery=true)
	List<DtoProductsDetails> findAllProducts();
	@Query(value="select p.id as id, p.product_name as productname, p.model as model, p.warrenty as warrenty, "
			+ "p.price as price, d.ram as ram, d.rom as rom, d.battery as battery "
			+ "from product p inner join details_product d on p.id=d.fkp_id where "
			+ "model =:model",nativeQuery=true)
	List<DtoProductsDetails> findBymodel(String model);

	
	Page<Product> findAll(Pageable pageable);
}
