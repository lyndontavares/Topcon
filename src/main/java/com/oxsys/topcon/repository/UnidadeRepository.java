package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.Unidade;

@RepositoryRestResource(collectionResourceRel = "conta", path = "conta", exported = true)
public interface UnidadeRepository extends PagingAndSortingRepository<Unidade, Long> {

}
