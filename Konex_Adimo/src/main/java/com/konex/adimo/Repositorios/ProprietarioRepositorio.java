package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Proprietario;

@Repository
public interface ProprietarioRepositorio extends JpaRepository<Proprietario, Integer>{
}
