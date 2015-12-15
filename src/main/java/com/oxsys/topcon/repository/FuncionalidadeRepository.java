package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.auth.Funcionalidade;

@RepositoryRestResource(collectionResourceRel="funcionalidade",path="funcionalidade",exported=true)
public interface FuncionalidadeRepository extends PagingAndSortingRepository<Funcionalidade, Long> {

}
