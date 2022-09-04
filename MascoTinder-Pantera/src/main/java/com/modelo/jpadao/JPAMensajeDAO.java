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
	public List<Mensaje> getMensajes() {
		List<Mensaje> lista = new ArrayList<Mensaje>();
		String sentenceJPQL = "SELECT men from mensaje men";
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
