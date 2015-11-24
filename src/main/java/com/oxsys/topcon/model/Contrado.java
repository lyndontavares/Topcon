package com.oxsys.topcon.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.oxsys.topcon.model.enums.ContratoTipo;

@Entity
@Table(name="tab_contrato")
public class Contrado {

	@Id
	@GeneratedValue
	private long id;
	
	private String numeroControle;
	
	private ContratoTipo tipo;

	private Date dataInicioVigencia;

	private Date dataFinalVigencia;
	
	private Pessoa pessoa;

	private Unidade unidade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumeroControle() {
		return numeroControle;
	}

	public void setNumeroControle(String numeroControle) {
		this.numeroControle = numeroControle;
	}

	public ContratoTipo getTipo() {
		return tipo;
	}

	public void setTipo(ContratoTipo tipo) {
		this.tipo = tipo;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public Date getDataFinalVigencia() {
		return dataFinalVigencia;
	}

	public void setDataFinalVigencia(Date dataFinalVigencia) {
		this.dataFinalVigencia = dataFinalVigencia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	
	
}
