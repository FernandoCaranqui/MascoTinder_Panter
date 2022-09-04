package com.modelo.jpadao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.modelo.dao.MascotaDAO;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO{
	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mascota> getMascotas() {
		List<Mascota> lista = new ArrayList<Mascota>();
		String sentenceJPQL = "SELECT d from Mascota d";
		//TypedQuery <Mascota> query = this.em.createQuery(sentenceJPQL, Mascota.class);
		//lista = query.getResultList();
		Query query = this.em.createQuery(sentenceJPQL);
		try {
			lista = query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
