package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;

public class TestJPA {

	public static void main(String[] args) {
			Duenio r = new Duenio();
			r.setNombre("Cristopher");
			r.setUser("crisPerez");
			r.setPasseword("cris123");
			
			DAOFactory.getFactory().getDuenioDAO().create(r);
	}

}
