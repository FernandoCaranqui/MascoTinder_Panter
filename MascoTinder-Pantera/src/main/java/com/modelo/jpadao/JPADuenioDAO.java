package com.modelo.jpadao;

import com.modelo.dao.DuenioDAO;
import com.modelo.entidades.Duenio;

public class JPADuenioDAO extends JPAGenericDAO<Duenio, Integer> implements DuenioDAO{

	public JPADuenioDAO() {
		super(Duenio.class);
	}

}
