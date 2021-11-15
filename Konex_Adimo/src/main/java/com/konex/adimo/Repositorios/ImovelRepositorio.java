package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Imovel;

@Repository
public interface ImovelRepositorio extends JpaRepository<Imovel, Integer>{
}
