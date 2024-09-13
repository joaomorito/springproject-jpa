package com.projetojavaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojavaweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
