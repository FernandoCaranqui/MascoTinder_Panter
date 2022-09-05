package com.modelo.jpadao;

import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;
import com.modelo.entidades.Match;
import com.modelo.entidades.Mensaje;

public class TestJPA {

	public static void main(String[] args) {
		Duenio d = new Duenio();
		d.setId(2);
		/*d.setNombre("Fernando");
		d.setUser("Fer123");
		d.setPassword("1234");
		DAOFactory.getFactory().getDuenioDAO().create(d);
		*/
		Mascota r = new Mascota();
		r.setNombre("Cooper");
		r.setEdad(1);
		r.setSexo("Masculino");
		r.setUbicacion("San Juan");
		r.setEspecie("Perro");
		r.setRaza("Mestiza");
		r.setDuenio(d);
		/*r.setPreferencias(null);
		r.setMatch(null);
		r.setMatches(null);
		r.setFotosMasc(0);*/
		
		DAOFactory.getFactory().getMascotaDAO().create(r);

		
			
		/*
		Duenio r1 = new Duenio();
		r1.setNombre("Migue");
		r1.setPassword("m1212");
		r1.setUser("curfram");
		r1.setMascotas(null);
		DAOFactory.getFactory().getDuenioDAO().create(r1);
		Duenio r2 = new Duenio();
		r2.setNombre("Cris");
		r2.setPassword("c1212");
		r2.setUser("cristosanty");
		r2.setMascotas(null);
		DAOFactory.getFactory().getDuenioDAO().create(r2);
		Duenio r3 = new Duenio();
		r3.setNombre("Liz");
		r3.setPassword("l1212");
		r3.setUser("lizjommy");
		r3.setMascotas(null);
		DAOFactory.getFactory().getDuenioDAO().create(r3);
		*/
/*
		Mascota m = new Mascota();
		m.setEdad(4);
		m.setEspecie("perro");
		m.setNombre("Tessa");
		m.setRaza("Puddle");
		m.setSexo("hembra");
		m.setUbicacion("Cuenca");

		DAOFactory.getFactory().getMascotaDAO().create(m);*/
		/*
		Mascota m1 = DAOFactory.getFactory().getMascotaDAO().getById(1);
		Mascota m2 = DAOFactory.getFactory().getMascotaDAO().getById(2);
		Match ma = new Match();
		ma.setPretendido(m1);
		ma.setPretendiente(m2);
		DAOFactory.getFactory().getMatchDAO().create(ma);
		*/
		
		Duenio d1 = DAOFactory.getFactory().getDuenioDAO().getDuenioById(2);
		Duenio d2 = DAOFactory.getFactory().getDuenioDAO().getDuenioById(1);
		String cont = "Hola\n"
				+ "Hola\n"
				+ "Como estas?";
		Mensaje me = new Mensaje();
		me.setReceptor(d2);
		me.setEmisor(d1);
		me.setContenido(cont);
		DAOFactory.getFactory().getMensajeDAO().create(me);
		
	}
	
	

}
