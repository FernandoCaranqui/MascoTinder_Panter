package com.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity(name = "preferencia")
public class Preferencia implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Preferencia")
	private Integer id;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "idDuenio")
	private Duenio duenioPreferencia;
	
	/*
	@JoinColumn(name = "edadMax")
	private List<Mascota> mascEdadMax;
	
	@JoinColumn(name = "edadMin")
	private List<Mascota> mascEdadMin;
	*/
	private int edadMax;
	private int edadMin;
	
	
	private static final long serialVersionUID = 1L;

	public Preferencia() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
	
	public Duenio getDuenioPreferencia() {
		return duenioPreferencia;
	}

	public void setDuenioPreferencia(Duenio duenioPreferencia) {
		this.duenioPreferencia = duenioPreferencia;
	}

/*	public List<Mascota> getMascEdadMax() {
		return mascEdadMax;
	}

	public void setMascEdadMax(List<Mascota> mascEdadMax) {
		this.mascEdadMax = mascEdadMax;
	}

	public List<Mascota> getMascEdadMin() {
		return mascEdadMin;
	}

	public void setMascEdadMin(List<Mascota> mascEdadMin) {
		this.mascEdadMin = mascEdadMin;
	}
*/
	@Override
	public int hashCode() {
		int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
	}
	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preferencia)) {
            return false;
        }
        Preferencia other = (Preferencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
   
}
