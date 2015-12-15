package com.oxsys.topcon.model.auth;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.oxsys.topcon.model.Usuario;

@Entity
@Table(name="tab_permissao")
public class Permissao {

	private long id;
	
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
