package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Imobiliaria;

@Repository
public interface ImobiliariaRepositorio extends JpaRepository<Imobiliaria, Integer> {
}
