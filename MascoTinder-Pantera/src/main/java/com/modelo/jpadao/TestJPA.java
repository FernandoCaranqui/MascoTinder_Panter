package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class TestJPA {

	public static void main(String[] args) {
			Duenio r = new Duenio();
			r.setNombre("Kevin");
			r.setPassword("123456");
			r.setUser("kevin123");
			r.setMascotas(null);
			
			DAOFactory.getFactory().getDuenioDAO().create(r);
	}

}
