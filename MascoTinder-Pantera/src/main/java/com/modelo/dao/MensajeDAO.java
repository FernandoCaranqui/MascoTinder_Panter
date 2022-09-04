package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.Mensaje;

public interface MensajeDAO extends GenericDAO<Mensaje, Integer>{
	public List<Mensaje> getMensajes();
}
