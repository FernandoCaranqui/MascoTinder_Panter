package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;

public class TestJPA {

	public static void main(String[] args) {
			Mascota m = new Mascota();
			m.setId(1);
			m.setNombre("Cristopher");
			m.setEdad(5);
			m.setEspecie("canguro");
			m.setRaza("negra");
			
			/*m.setUser("crisPerez");
			m.setPasseword("cris123");*/
			
			//DAOFactory.getFactory().getDuenioDAO().create(m);
	}

}
