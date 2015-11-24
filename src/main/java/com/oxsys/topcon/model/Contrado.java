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
	
	
	
}
