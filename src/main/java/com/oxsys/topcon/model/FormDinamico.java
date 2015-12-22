package com.oxsys.topcon.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.oxsys.topcon.model.enums.TipoArtefato;

@Entity
@Table(name="tab_form_dinamico")
public class FormDinamico {

	@Id
	@GeneratedValue
	private long id;
	
	private String descricao;
	
	private String template;
	
	@Enumerated(EnumType.STRING)
	private TipoArtefato artefato;

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

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public TipoArtefato getArtefato() {
		return artefato;
	}

	public void setArtefato(TipoArtefato artefato) {
		this.artefato = artefato;
	}

	@Override
	public String toString() {
		return "FormDinamico [id=" + id + ", descricao=" + descricao
				+ ", template=" + template + ", artefato=" + artefato + "]";
	}

	public FormDinamico(long id, String descricao, String template,
			TipoArtefato artefato) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.template = template;
		this.artefato = artefato;
	}
	
	public FormDinamico(){
		
	}
	
	
}
