package com.oxsys.topcon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oxsys.topcon.model.enums.UnidadeTipo;

@Entity
@Table(name="tab_vaga")
public class Unidade {

	@Id
	@GeneratedValue
	private long id;
	
	@Enumerated(EnumType.STRING)
	private UnidadeTipo tipo;
	
	private String quadra;

	private String bloco;
	
	private String rua;
	
	private String numero;
	
	private String andar;
	
	private long quarto;
	
	@ JsonIgnore 
	@OneToMany(mappedBy = "tabela", fetch = FetchType.LAZY)
	private List<Vaga> campos;
	private Vaga vagaGaragem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UnidadeTipo getTipo() {
		return tipo;
	}

	public void setTipo(UnidadeTipo tipo) {
		this.tipo = tipo;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public long getQuarto() {
		return quarto;
	}

	public void setQuarto(long quarto) {
		this.quarto = quarto;
	}

	public Vaga getVagaGaragem() {
		return vagaGaragem;
	}

	public void setVagaGaragem(Vaga vagaGaragem) {
		this.vagaGaragem = vagaGaragem;
	}

	
	
}
