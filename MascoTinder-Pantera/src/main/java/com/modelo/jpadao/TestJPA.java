package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;
import com.modelo.entidades.Match;

public class TestJPA {

	public static void main(String[] args) {
/*
		Duenio r = new Duenio();
		r.setNombre("Liz");
		r.setPassword("l1212");
		r.setUser("lizjommy");
		r.setMascotas(null);

		DAOFactory.getFactory().getDuenioDAO().create(r);*/
/*
		Mascota m = new Mascota();
		m.setEdad(1);
		m.setEspecie("perro");
		m.setNombre("Tessa");
		m.setRaza("Puddle");
		m.setSexo("hembra");
		m.setUbicacion("Cuenca");

		DAOFactory.getFactory().getMascotaDAO().create(m);*/
		
		Mascota m1 = DAOFactory.getFactory().getMascotaDAO().getById(1);
		Mascota m2 = DAOFactory.getFactory().getMascotaDAO().getById(3);
		Match ma = new Match();
		ma.setPretendido(m1);
		ma.setPretendiente(m2);
		DAOFactory.getFactory().getMatchDAO().create(ma);
	}

}
