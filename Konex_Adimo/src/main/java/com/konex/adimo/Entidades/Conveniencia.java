package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Conveniencia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idconv")
	private Integer idConv;
	
	@Column(length = 50)
	private String nome;
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "lista_conveniencias",
    joinColumns = @JoinColumn(name = "fk_conv_lista"),
    inverseJoinColumns = @JoinColumn(name = "fk_imob_lista"))
    private List<Imovel> imovel = new ArrayList<>();
	
	public Conveniencia() {}

	public Conveniencia(Integer idConv, String nome) {
		this.idConv = idConv;
		this.nome = nome;
	}

	public Integer getIdConv() {
		return idConv;
	}

	public void setIdConv(Integer idConv) {
		this.idConv = idConv;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idConv, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conveniencia other = (Conveniencia) obj;
		return Objects.equals(idConv, other.idConv) && Objects.equals(nome, other.nome);
	}
}
