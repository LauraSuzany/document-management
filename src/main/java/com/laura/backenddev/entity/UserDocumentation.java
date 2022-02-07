package com.laura.backenddev.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "UserDocumentation")
public class UserDocumentation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@NonNull
	private byte document;
	@NotBlank
	private String tipoDocumento;
	@ManyToOne
	// @JsonIgnore
	@JoinColumn(name = "User_id", nullable = false)
	private User user;

	public UserDocumentation() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDocumentation(@NotBlank byte document, @NotBlank String tipoDocumento, User user) {
		super();
		this.document = document;
		this.tipoDocumento = tipoDocumento;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public byte getDocument() {
		return document;
	}

	public void setDocument(byte document) {
		this.document = document;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDocumentation other = (UserDocumentation) obj;
		return id == other.id;
	}

}
