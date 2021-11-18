package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proprietario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idprop")
	private Integer idProp;
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 14)
	private String cpf;
	
	@Column(length = 13)
	private String rg;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 15)
	private String celular;
	
	public Proprietario() {}

	public Proprietario(Integer idProp,String nome, String cpf, String rg, String email, String celular) {
		this.idProp = idProp;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.celular = celular;
	}

	public Integer getIdProp() {
		return idProp;
	}

	public void setIdProp(Integer idProp) {
		this.idProp = idProp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		return Objects.equals(idProp, other.idProp);
	}
}
