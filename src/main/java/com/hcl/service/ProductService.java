package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Product;
import com.hcl.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAllProduct() {
		
		return repo.findAll();
	}
	
	public Product createProduct(Product prd) {
		repo.save(prd);
		return prd;
	}
	
	public Optional<Product> getProductById(Integer id) {
		
		return repo.findById(id);
	}
	
	public void deleteProduct(Integer id) {
		
		repo.deleteById(id);
	}
	
	//Include update product
	public void updateProduct(Integer id, Product prd) {
		
		repo.getById(id).setName(prd.getName());
		repo.getById(id).setPrice(prd.getPrice());
		repo.save(repo.getById(id));
		
	}
}
