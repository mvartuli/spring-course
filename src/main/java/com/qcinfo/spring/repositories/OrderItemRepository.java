package com.qcinfo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcinfo.spring.entities.OrderItem;
import com.qcinfo.spring.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
