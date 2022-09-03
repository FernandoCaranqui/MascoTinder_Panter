package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class TestJPA {

	public static void main(String[] args) {
			Duenio r = new Duenio();
			r.setNombre("Migue");
			r.setPassword("m1212");
			r.setUser("curfram");
			r.setMascotas(null);
			
			DAOFactory.getFactory().getDuenioDAO().create(r);
	}

}
