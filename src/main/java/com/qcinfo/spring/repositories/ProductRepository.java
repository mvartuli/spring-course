package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
