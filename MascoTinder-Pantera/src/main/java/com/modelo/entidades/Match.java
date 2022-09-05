package com.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity
@Table(name = "matches")
public class Match implements Serializable {
	private static final long serialVersionUID = 1L;

	public Match() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn
	private Mascota recibeMatch;
	

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
<<<<<<< HEAD
	

	public Mascota getRecibeMatch() {
		return recibeMatch;
	}

	public void setRecibeMatch(Mascota recibeMatch) {
		this.recibeMatch = recibeMatch;
	}



	private static final long serialVersionUID = 1L;

	public Match() {
	}
	
=======
>>>>>>> origin/dao-cris-migue
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
