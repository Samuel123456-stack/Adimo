package com.konex.adimo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.NewsLetter;

@Repository
public interface NewsLetterRepositorio extends JpaRepository<NewsLetter, Integer>{

}
