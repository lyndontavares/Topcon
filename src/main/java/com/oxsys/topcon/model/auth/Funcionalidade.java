package com.oxsys.topcon.model.auth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_funcionalidade")
public class Funcionalidade {

	@Id
	@GeneratedValue
	private long id;
	
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Funcionalidade [descricao=" + descricao + "]";
	}
	
	
	
}
