package com.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

import org.eclipse.persistence.internal.oxm.schema.model.List;

/**
 * Entity implementation class for Entity: Foto
 *
 */
@Entity
@Table(name = "foto")
public class Foto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "foto_ID")
	private Integer id;
	@Column(name = "urlFoto")
	private String urlFoto;
	private List fotos;
	
	
	
	private static final long serialVersionUID = 1L;

	public Foto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public List getFotos() {
		return fotos;
	}

	public void setFotos(List fotos) {
		this.fotos = fotos;
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
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
   
}
