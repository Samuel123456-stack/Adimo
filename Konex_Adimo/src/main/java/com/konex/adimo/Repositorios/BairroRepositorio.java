package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Bairro;

@Repository
public interface BairroRepositorio extends JpaRepository<Bairro, Integer> {
}
