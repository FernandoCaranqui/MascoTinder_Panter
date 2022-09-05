package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.PreferenciaDAO;
import com.modelo.entidades.Mascota;
import com.modelo.entidades.Preferencia;

public class JPAPreferenciaDAO extends JPAGenericDAO<Preferencia, Integer> implements PreferenciaDAO{

	public JPAPreferenciaDAO() {
		super(Preferencia.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Preferencia> getPreferencias(Preferencia p) {
		List<Preferencia> lista = new ArrayList<Preferencia>();
		String sentenceJPQL = "SELECT p from Preferencia p WHERE p.duenioPreferencia= :param_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_id", p);
		try {
			lista = query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
