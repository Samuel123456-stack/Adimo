package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Imobiliaria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmob")
	private Integer idImob;
	
	@Column(length = 50)
	private String confeci;
	
	@Column(length = 50)
	private String logradouro;
	
	private Integer numero;
	
	@Column(length = 9)
	private String cep;
	
	@OneToOne
	@JoinColumn(name = "fk_bai_imob")
	private Bairro bairro;
	
	public Imobiliaria(){}

	public Imobiliaria(Integer idImob, String confeci, String logradouro, Integer numero, String cep) {
		this.idImob = idImob;
		this.confeci = confeci;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	public Integer getIdImob() {
		return idImob;
	}

	public void setIdImob(Integer idImob) {
		this.idImob = idImob;
	}

	public String getConfeci() {
		return confeci;
	}

	public void setConfeci(String confeci) {
		this.confeci = confeci;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idImob);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imobiliaria other = (Imobiliaria) obj;
		return Objects.equals(idImob, other.idImob);
	}
}
