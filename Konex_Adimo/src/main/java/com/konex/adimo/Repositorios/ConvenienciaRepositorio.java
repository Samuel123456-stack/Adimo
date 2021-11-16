package com.konex.adimo.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Conveniencia;

@Repository
public interface ConvenienciaRepositorio extends JpaRepository<Conveniencia, Integer> {
	
	@Query(nativeQuery = true,value="select * "
			+ "from conveniencia "
			+ "inner join lista_conveniencias on fk_conv_lista = idconv "
			+ "inner join imovel on fk_imob_lista = idimov "
			+ "where fk_imob_lista = :id")
	List<Conveniencia> buscaListaConveniencia(Integer id);
}
