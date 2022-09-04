package com.modelo.dao;

import java.util.List;
import com.modelo.entidades.Duenio;

public interface DuenioDAO extends GenericDAO<Duenio, Integer> {
	public Duenio autorizarDuenio(String nombre, String clave);
	public Duenio getDuenioById(int id);
	//public List<Duenio> getAll();
}