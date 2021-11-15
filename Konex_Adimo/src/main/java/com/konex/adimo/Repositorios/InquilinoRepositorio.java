package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Inquilino;

@Repository
public interface InquilinoRepositorio extends JpaRepository<Inquilino, Integer> {
}
