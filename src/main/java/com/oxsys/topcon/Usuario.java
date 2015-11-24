package com.oxsys.topcon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.oxsys.topcon.model.enums.UsuarioSituacao;

@Entity
@Table(name="tab_usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private long id;
	
	private String login;
	
	private String senha;
	
	private UsuarioSituacao situacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsuarioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(UsuarioSituacao situacao) {
		this.situacao = situacao;
	}
	
	
	
	
}
