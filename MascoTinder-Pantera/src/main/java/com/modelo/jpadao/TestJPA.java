package com.modelo.jpadao;

import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

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

		
			
	}
	
	

}
