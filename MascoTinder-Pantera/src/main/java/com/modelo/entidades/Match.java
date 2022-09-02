package com.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity

public class Match implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "Pretendido")
	private Mascota pretendido;
	@Column(Value = "Pretendiente");
	
	private static final long serialVersionUID = 1L;

	public Match() {
		super();
	}
   
}
