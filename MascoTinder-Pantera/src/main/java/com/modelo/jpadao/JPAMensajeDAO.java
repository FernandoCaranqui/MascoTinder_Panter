package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.MensajeDAO;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mensaje;

public class JPAMensajeDAO extends JPAGenericDAO<Mensaje, Integer> implements MensajeDAO{

	public JPAMensajeDAO() {
		super(Mensaje.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Mensaje getMensajes(Duenio emisor, Duenio receptor) {
		/*List<Mensaje> lista = new ArrayList<Mensaje>();*/
		Mensaje mensaje = new Mensaje();
		String sentenceJPQL = "SELECT m from Mensaje m WHERE m.emisor= :emisor_id AND m.receptor= :receptor_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("emisor_id", emisor);
		query.setParameter("receptor_id", receptor);
		try {
			//lista = query.getResultList();
			mensaje = (Mensaje) query.getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mensaje;
	}

}
