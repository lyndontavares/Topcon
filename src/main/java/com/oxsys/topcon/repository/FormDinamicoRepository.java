package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.FormDinamico;

@RepositoryRestResource(collectionResourceRel="dinamico",path="dinamico", exported=true)
public interface FormDinamicoRepository extends PagingAndSortingRepository<FormDinamico,Long>{

}
