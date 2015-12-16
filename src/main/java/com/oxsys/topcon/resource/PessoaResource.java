package com.oxsys.topcon.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxsys.topcon.model.Pessoa;
import com.oxsys.topcon.model.enums.PessoaSituacao;
import com.oxsys.topcon.repository.PessoaRepository;

@RestController
@RequestMapping("/api")
public class PessoaResource {

@Autowired	
private PessoaRepository repo;
	
	@RequestMapping( value="/pessoa/filtro", method = RequestMethod.POST )
	public Iterable<Pessoa> listaPessoas(@RequestBody  Pessoa pessoa){
		
		System.out.println(pessoa);
		if(pessoa.getSituacao() == null){
			pessoa.setSituacao( PessoaSituacao.ATIVA  );
		}
		
		return repo.findByIdOrNomeOrSituacao( pessoa.getId() , pessoa.getNome() , pessoa.getSituacao() );
		
	}
	
	
}
