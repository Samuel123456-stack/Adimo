package com.konex.adimo.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.konex.adimo.Entidades.Imovel;

@Repository
public interface ImovelRepositorio extends JpaRepository<Imovel, Integer>{
	
	@Query(nativeQuery = true,value="select * "
			+ "from imovel "
			+ "where fk_bai_imov = :id")
	List<Imovel> buscaImovelPorBairro(Integer id);
	
	@Query(nativeQuery = true,value="select * "
			+ "from imovel "
			+ "where idimov = :id")
	Imovel buscaImovelPorId(Integer id);
	
	@Query(nativeQuery= true, value="select * from imovel where fk_prop_imov= :id")
	List<Imovel> listaImovelAlu(Integer id);
	
}
