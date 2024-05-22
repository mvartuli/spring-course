package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
