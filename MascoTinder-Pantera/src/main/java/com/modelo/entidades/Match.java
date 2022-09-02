package com.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity
@Table(name = "match")
public class Match implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "idMascotaPretendido")
	private Mascota pretendido;
	@Column(name = "idMascotaPretendiente")
	private Mascota pretendiente;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Mascota getPretendido() {
		return pretendido;
	}

	public void setPretendido(Mascota pretendido) {
		this.pretendido = pretendido;
	}

	public Mascota getPretendiente() {
		return pretendiente;
	}

	public void setPretendiente(Mascota pretendiente) {
		this.pretendiente = pretendiente;
	}

	private static final long serialVersionUID = 1L;

	public Match() {
		super();
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
        if (!(object instanceof Match)) {
            return false;
        }
        Match other = (Match) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
   
}
