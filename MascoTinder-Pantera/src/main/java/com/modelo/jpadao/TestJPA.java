package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class TestJPA {

	public static void main(String[] args) {
/*
		Duenio r = new Duenio();
		r.setNombre("Migue");
		r.setPassword("m1212");
		r.setUser("curfram");
		r.setMascotas(null);

		DAOFactory.getFactory().getDuenioDAO().create(r);
*/
		Mascota m = new Mascota();
		m.setEdad(3);
		m.setEspecie("gato");
		m.setNombre("Linda");
		m.setRaza("michi");
		m.setSexo("hembra");
		m.setUbicacion("Quito");

		DAOFactory.getFactory().getMascotaDAO().create(m);
	}

}
