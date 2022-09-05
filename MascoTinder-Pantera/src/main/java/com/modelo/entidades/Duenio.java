package com.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "duenio")
public class Duenio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "duenio_nombre")
	private String nombre;
	@Column(name = "duenio_user")
	private String user;
	@Column(name = "duenio_password")
	private String password;
	
	@OneToMany(mappedBy = "duenio")
	@JoinColumn
	private List<Mascota> mascotas;
	
	@OneToMany(mappedBy = "receptor")
	@JoinColumn
	private List<Mensaje> mensajesRecibidos;
	
	@OneToMany(mappedBy = "receptor")
	@JoinColumn
	private List<Mensaje> mensajesEnviados;
	
	@OneToMany(mappedBy = "duenioPreferencia")
	@JoinColumn
	private List<Preferencia> preferencia;
	
	

	
	public Duenio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasseword() {
		return password;
	}

	public void setPasseword(String passeword) {
		this.password = passeword;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	/*
	public List<Mensaje> getMensajesRecibidos() {
		return mensajesRecibidos;
	}

	public void setMensajesRecibidos(List<Mensaje> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}

	public List<Mensaje> getMensajesEnviados() {
		return mensajesEnviados;
	}

	public void setMensajesEnviados(List<Mensaje> mensajesEnviados) {
		this.mensajesEnviados = mensajesEnviados;
	}

	public List<Preferencia> getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(List<Preferencia> preferencia) {
		this.preferencia = preferencia;
	}*/

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Duenio [id=" + id + ", nombre=" + nombre + ", user=" + user + ", passeword=" + password + "]";
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null? id.hashCode(): 0);
		return hash;
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Duenio)) {
			return false;
		}
		Duenio other = (Duenio) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	
}

