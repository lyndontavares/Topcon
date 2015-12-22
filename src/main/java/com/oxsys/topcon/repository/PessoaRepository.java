package com.oxsys.topcon.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.Pessoa;
import com.oxsys.topcon.model.enums.PessoaSituacao;


@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa", exported = true)
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long>  {
	
	Iterable<Pessoa> findByIdOrNomeOrSituacao( long id, String nome, PessoaSituacao  situacao );
	
	//@Query(value = "SELECT r.* from finmvrv r, finmvfi f where f.ncodimvfi = r.ncodimvfi and f.ncodidepa in (?1) and r.ddtcvmvrv between ?2 and ?3", nativeQuery = true)

	@Query( value = "select p from pessoa p" , nativeQuery = true) 
	Iterable<Pessoa> findPessoaWithFilter();
	
}
