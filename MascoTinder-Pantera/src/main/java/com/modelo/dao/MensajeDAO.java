package com.modelo.dao;

import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mensaje;

public interface MensajeDAO extends GenericDAO<Mensaje, Integer>{
	public Mensaje getMensajes(Duenio emisor, Duenio receptor);
}
