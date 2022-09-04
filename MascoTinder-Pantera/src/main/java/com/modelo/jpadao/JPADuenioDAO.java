package com.modelo.jpadao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.modelo.dao.DuenioDAO;
import com.modelo.entidades.Duenio;

public class JPADuenioDAO extends JPAGenericDAO<Duenio, Integer> implements DuenioDAO{

	public JPADuenioDAO() {
		super(Duenio.class);
	}
	
	@Override
	public Duenio autorizarDuenio(String nombre, String clave) {

		Duenio duenioAutorizado = null;
		String sentenceJPQL = "SELECT d from Duenio d WHERE d.nombre= :param_nombre AND d.password= :param_clave";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_nombre", nombre);
		query.setParameter("param_clave", clave);
		try {
			duenioAutorizado = (Duenio) query.getSingleResult();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return duenioAutorizado;
	}

	@Override
	public Duenio getDuenioById(int id) {
		Duenio duenio = null;
		String sentenceJPQL = "SELECT d from Duenio d WHERE d.id= :param_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_id", id);
		try {
			duenio = (Duenio) query.getSingleResult();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return duenio;
	}
}
