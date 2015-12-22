package com.oxsys.topcon.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxsys.topcon.model.auth.MenuJson;
import com.oxsys.topcon.repository.PessoaRepository;

@RestController
@RequestMapping("/api")
public class MenuResource {

	@Autowired
	private PessoaRepository repo;

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public Iterable<MenuJson> listaMenu() {

		return null;

	}

}
