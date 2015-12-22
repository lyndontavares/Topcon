package com.oxsys.topcon.model.auth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_grup_usuaurio")
public class Grupo {

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

	public Grupo(long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", descricao=" + descricao + "]";
	}
	
	public Grupo(){
		
	}
	
}
