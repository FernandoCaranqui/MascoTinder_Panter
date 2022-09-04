package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public interface MascotaDAO extends GenericDAO<Mascota, Integer> {
	
	//public Mascota autorizar(String usuario, String password);
	public List<Mascota> getMascotas(Duenio d);
}
