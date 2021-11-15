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

@Entity
public class Inquilino implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idqui")
	private Integer idQui;
	
	@Column(length = 50)
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "fk_imov_iqui")
	private Imovel imovel;
	
	public Inquilino() {}

	public Inquilino(Integer idQui, String nome, Imovel imovel) {
		this.idQui = idQui;
		this.nome = nome;
		this.imovel = imovel;
	}

	public Integer getIdQui() {
		return idQui;
	}

	public void setIdQui(Integer idQui) {
		this.idQui = idQui;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idQui);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inquilino other = (Inquilino) obj;
		return Objects.equals(idQui, other.idQui);
	}
}
