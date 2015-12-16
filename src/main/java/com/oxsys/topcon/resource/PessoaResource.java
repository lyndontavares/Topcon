package com.oxsys.topcon.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxsys.topcon.model.Pessoa;
import com.oxsys.topcon.repository.PessoaRepository;

@RestController
@RequestMapping("/api")
public class PessoaResource {

	
private PessoaRepository repo;
	
	@RequestMapping( value="/pessoa/filtro", method = RequestMethod.POST )
	public Iterable<Pessoa> listaPessoas(@RequestBody final  Pessoa pessoa){
		return repo.findAll();
	}
	
	
}
