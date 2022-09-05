package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.Preferencia;

public interface PreferenciaDAO extends GenericDAO<Preferencia, Integer>{
	public List<Preferencia> getPreferencias(Preferencia p);
}
