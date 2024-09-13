package com.projetojavaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojavaweb.course.entities.OrderItem;
import com.projetojavaweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
