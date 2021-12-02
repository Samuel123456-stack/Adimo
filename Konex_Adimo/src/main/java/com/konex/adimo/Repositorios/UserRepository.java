package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
