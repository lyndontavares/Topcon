package com.oxsys.topcon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.oxsys.topcon.model.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

	Usuario findByNomeIgnoreCase(String nome);
	
}
