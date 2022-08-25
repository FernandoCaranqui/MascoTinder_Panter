package com.modelo.jpadao;

import modelo.dao.DAOFactory;
import modelo.dao.DuenioDAO;
import modelo.dao.MascotaDAO;

public class JPADAOFactory extends DAOFactory{

	public MascotaDAO getMascotaDAO() {
		return new JPAMascotaDAO();
	}

	public DuenioDAO getDuenioDAO() {
		return new JPADuenioDAO();
	}



}
