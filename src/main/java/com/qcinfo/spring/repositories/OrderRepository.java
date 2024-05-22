package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
