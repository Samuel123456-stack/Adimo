package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfunc")
	private Integer idFunc;
	
	@Column(length = 50)
	private String nome;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 8)
	private String senha;
	
	@OneToOne
	@JoinColumn(name = "fk_imob_fun")
	private Imobiliaria imobiliaria;
	

	public Funcionario() {}


	public Funcionario(Integer idFunc, String nome, String email, String senha) {
		this.idFunc = idFunc;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public Integer getIdFunc() {
		return idFunc;
	}


	public void setIdFunc(Integer idFunc) {
		this.idFunc = idFunc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idFunc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(idFunc, other.idFunc);
	}
}
