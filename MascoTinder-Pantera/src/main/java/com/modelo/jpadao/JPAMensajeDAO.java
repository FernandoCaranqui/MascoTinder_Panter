package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.MensajeDAO;
import com.modelo.entidades.Mensaje;

public class JPAMensajeDAO extends JPAGenericDAO<Mensaje, Integer> implements MensajeDAO{

	public JPAMensajeDAO() {
		super(Mensaje.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mensaje> getMensajes(int id) {
		List<Mensaje> lista = new ArrayList<Mensaje>();
		String sentenceJPQL = "SELECT m from Mensaje m WHERE m.id= :param_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_id", id);
		try {
			lista = query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
