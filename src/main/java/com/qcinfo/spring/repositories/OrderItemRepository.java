package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
