package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.modelo.dao.MascotaDAO;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO{
	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	@Override
	public Mascota getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mascota> getMascotas() {
		List<Mascota> lista = new ArrayList<Mascota>();
		String sentenceJPQL = "SELECT d FROM duenio d";
		TypedQuery <Mascota> query = this.em.createQuery(sentenceJPQL, Mascota.class);
		lista = query.getResultList();
		return lista;
	}

}
