package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konex.adimo.Entidades.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
