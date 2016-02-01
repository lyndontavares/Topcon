package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.Contrado;

@RepositoryRestResource(collectionResourceRel = "contrato", path = "contrato", exported = true)
public interface ContratoRepository extends PagingAndSortingRepository<Contrado, Long> {

	
	Iterable<Contrado> findByPessoaId ( @Param("id") long id);
	
	Iterable<Contrado> findById ( @Param("id") long id);
	
	Iterable<Contrado> findByProprietarioId ( @Param("id") long id);
	
	Iterable<Contrado> findByUnidadeNumero  ( @Param("numero") String numero);
	
	Iterable<Contrado> findByUnidadeAndarOrUnidadeBlocoOrUnidadeNumero  (
			@Param("andar") String andar, 
			@Param("unidade") String bloco, 
			@Param("numero") String numero);
	
}
