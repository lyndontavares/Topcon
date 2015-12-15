package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oxsys.topcon.model.auth.Permissao;

@RepositoryRestResource(collectionResourceRel="permissao",path="permissao",exported=true)
public interface PermissaoRepository extends PagingAndSortingRepository<Permissao, Long>  {

}
