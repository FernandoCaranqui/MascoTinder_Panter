package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DuenioDAO;
import com.modelo.dao.MascotaDAO;
import com.modelo.dao.MatchDAO;
import com.modelo.dao.MensajeDAO;
import com.modelo.dao.PreferenciaDAO;

public class JPADAOFactory extends DAOFactory{

	public MascotaDAO getMascotaDAO() {
		return new JPAMascotaDAO();
	}
	
	public DuenioDAO getDuenioDAO() {
		return new JPADuenioDAO();
	}
	
	public MensajeDAO getMensajeDAO() {
		return new JPAMensajeDAO();
	}

	public MatchDAO getMatchDAO() {
		return new JPAMatchDAO();
	}

	public PreferenciaDAO getPreferenciaDAO() {
		return new JPAPreferenciaDAO();
	}


}
