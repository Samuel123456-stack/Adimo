package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Funcionario;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer>{

}
