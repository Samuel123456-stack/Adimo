package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Conveniencia;

@Repository
public interface ConvenienciaRepositorio extends JpaRepository<Conveniencia, Integer> {

}
