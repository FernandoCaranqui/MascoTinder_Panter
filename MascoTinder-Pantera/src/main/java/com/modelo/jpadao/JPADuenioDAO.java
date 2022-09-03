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
		String sentenceJPQL = "SELECT d from Duenio d WHERE d.user= :duenio_user AND d.password= :duenio_password";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("duenio_user", nombre);
		query.setParameter("duenio_password", clave);
		try {
			duenioAutorizado = (Duenio) query.getSingleResult();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return duenioAutorizado;
	}
}
