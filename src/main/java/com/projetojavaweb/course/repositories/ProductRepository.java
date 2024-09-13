package com.projetojavaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojavaweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
