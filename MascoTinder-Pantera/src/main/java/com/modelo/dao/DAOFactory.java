package com.modelo.dao;

//import modelo.jdbcdao.JDBCDAOFactory;
import com.modelo.jpadao.JPADAOFactory;

public abstract class DAOFactory {
	//protected static DAOFactory instancia = new JDBCDAOFactory();
	protected static DAOFactory instancia = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return instancia;
	}
	
	public abstract DuenioDAO getDuenioDAO();
	public abstract MascotaDAO getMascotaDAO();

}
