package com.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "mensaje")
public class Mensaje implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "idReceptor")
	private Duenio receptor;
	
	@ManyToOne
	@JoinColumn (name = "idEmisor")
	private Duenio emisor;
	
	@JoinColumn (name = "contenido")
	private String contenido;
	

	
	
	private static final long serialVersionUID = 1L;

	public Mensaje() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Duenio getReceptor() {
		return receptor;
	}

	public void setReceptor(Duenio receptor) {
		this.receptor = receptor;
	}

	public Duenio getEmisor() {
		return emisor;
	}

	public void setEmisor(Duenio emisor) {
		this.emisor = emisor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	@Override
	public int hashCode() {
		int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
	}
	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
	
   
}
