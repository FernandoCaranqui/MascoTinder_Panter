package com.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer id;
	
	@Column(name="mascot_nombre")
	private String nombre;
	
	@Column(name="mascot_especie")
	private String especie;
	
	@Column(name="mascot_raza")
	private String raza;
	
	@Column (name="mascot_edad")
	private int edad;
	
	@Column (name="sexo")
	private String sexo;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@ManyToOne
	@JoinColumn(name="id_Duenio")
	private Duenio duenio;
	
	
	@ManyToOne
	@JoinColumn
	private Preferencia preferencias;
	
	@OneToMany(mappedBy = "fotosMasc")
	@JoinColumn(name = "id_Mascota")
	private List<Foto> fotosMasc;
	
	@OneToMany
	@JoinColumn(name = "pretendiente")
	private List<Match> matches;
	
	@OneToOne
	@JoinColumn
	private Match match;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		duenio = duenio;
	}
	
	

	public Preferencia getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(Preferencia preferencias) {
		this.preferencias = preferencias;
	}

	public List<Foto> getFotosMasc() {
		return fotosMasc;
	}

	public void setFotosMasc(List<Foto> fotosMasc) {
		this.fotosMasc = fotosMasc;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad
				+ "]";
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null? id.hashCode(): 0);
		return hash;
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Mascota)) {
			return false;
		}
		Mascota other = (Mascota) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	
}
	
	

