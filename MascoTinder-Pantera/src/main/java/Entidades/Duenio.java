package Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Duenio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "duenio_codigo")
	private Integer id;
	@Column(name = "duenio_nombre")
	private String nombre;
	@Column(name = "duenio_user")
	private String user;
	@Column(name = "duenio_password")
	private String password;
	
	
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
