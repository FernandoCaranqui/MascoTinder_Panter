package com.modelo.jpadao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.MascotaDAO;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO{
	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mascota> getMascotas(Duenio d) {
		List<Mascota> lista = new ArrayList<Mascota>();
		String sentenceJPQL = "SELECT m from Mascota m WHERE m.duenio= :param_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_id", d);
		try {
			lista = query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
