package com.hcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hcl.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
