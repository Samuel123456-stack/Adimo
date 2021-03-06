package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Imovel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idimov")
	private Integer idImov;
	
	@Column(length = 200)
	private String foto;
	
	@Column(length = 50)
	private String logradouro;
	
	private Integer numero;
	
	@Column(length = 30)
	private String complemento;
	
	@Column(length = 9)
	private String cep;
	
	private Integer tamanho;
	
	@Column(name = "qtecomodos")
	private Integer qteComodos;
	
	@Column(name = "qtevaga")
	private Integer qteVaga;
	
	@Column(length = 200)
	private String descricao;
	
	@Column(columnDefinition = "Decimal(7.2)")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "fk_imob_imov")
	private Imobiliaria imobiliaria;
	
	@ManyToOne
	@JoinColumn(name = "fk_prop_imov")
	private Proprietario proprietario;
	
	@OneToOne
	@JoinColumn(name = "fk_bai_imov")
	private Bairro bairro;
	
	public Imovel() {}

	public Imovel(Integer idImov, String foto, String logradouro, Integer numero, String complemento, String cep, Integer tamanho,
			Integer qteComodos, Integer qteVaga, String descricao, BigDecimal valor,
			Imobiliaria imobiliaria, Proprietario proprietario, Bairro bairro) {
		this.idImov = idImov;
		this.foto = foto;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.tamanho = tamanho;
		this.qteComodos = qteComodos;
		this.qteVaga = qteVaga;
		this.descricao = descricao;
		this.valor = valor;
		this.imobiliaria = imobiliaria;
		this.proprietario = proprietario;
		this.bairro = bairro;
	}

	public Integer getIdImov() {
		return idImov;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setIdImov(Integer idImov) {
		this.idImov = idImov;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getQteComodos() {
		return qteComodos;
	}

	public void setQteComodos(Integer qteComodos) {
		this.qteComodos = qteComodos;
	}

	public Integer getQteVaga() {
		return qteVaga;
	}

	public void setQteVaga(Integer qteVaga) {
		this.qteVaga = qteVaga;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Imobiliaria getImobiliaria() {
		return imobiliaria;
	}

	public void setImobiliaria(Imobiliaria imobiliaria) {
		this.imobiliaria = imobiliaria;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idImov);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imovel other = (Imovel) obj;
		return Objects.equals(idImov, other.idImov);
	}
}
