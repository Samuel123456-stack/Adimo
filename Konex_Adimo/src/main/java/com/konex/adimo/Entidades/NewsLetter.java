package com.konex.adimo.Entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "newsletter")
public class NewsLetter implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idnew")
	private Integer idNew;
	
	@NotBlank
	@Email
	@Column(length = 50)
	private String email;
	
	public NewsLetter() {}

	public NewsLetter(Integer idNew, String email) {
		this.idNew = idNew;
		this.email = email;
	}

	public Integer getIdNew() {
		return idNew;
	}

	public void setIdNew(Integer idNew) {
		this.idNew = idNew;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsLetter other = (NewsLetter) obj;
		return Objects.equals(email, other.email);
	}
}
