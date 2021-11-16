package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cidade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcid")
	private Integer idCid;
	
	@Column(length = 50)
	private String nome;
		
	public Cidade() {}

	public Cidade(Integer idCid, String nome) {
		this.idCid = idCid;
		this.nome = nome;
	}
	
	public Cidade(String nome) {
		this.nome = nome;
	}

	public Integer getIdCid() {
		return idCid;
	}

	public void setIdCid(Integer idCid) {
		this.idCid = idCid;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(idCid, other.idCid);
	}
}
