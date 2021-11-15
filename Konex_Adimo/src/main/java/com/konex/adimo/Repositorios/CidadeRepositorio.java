package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Cidade;

@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Integer>{

}
