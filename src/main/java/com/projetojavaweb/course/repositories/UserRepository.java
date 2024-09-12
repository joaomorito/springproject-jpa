package com.projetojavaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojavaweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
