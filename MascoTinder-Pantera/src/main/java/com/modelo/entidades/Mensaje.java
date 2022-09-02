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
	@Column (name = "idReceptor")
	private Duenio Receptor;
	@Column (name = "idEmisor")
	private Duenio emisor;
	@Column (name = "contenido")
	private Duenio contenido;
	
	
	private static final long serialVersionUID = 1L;

	public Mensaje() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Duenio getReceptor() {
		return Receptor;
	}

	public void setReceptor(Duenio receptor) {
		Receptor = receptor;
	}

	public Duenio getEmisor() {
		return emisor;
	}

	public void setEmisor(Duenio emisor) {
		this.emisor = emisor;
	}

	public Duenio getContenido() {
		return contenido;
	}

	public void setContenido(Duenio contenido) {
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