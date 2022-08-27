package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DuenioDAO;
import com.modelo.dao.MascotaDAO;

public class JPADAOFactory extends DAOFactory{

	public MascotaDAO getMascotaDAO() {
		return new JPAMascotaDAO();
	}
	
	public DuenioDAO getDuenioDAO() {
		return new JPADuenioDAO();
	}


}
