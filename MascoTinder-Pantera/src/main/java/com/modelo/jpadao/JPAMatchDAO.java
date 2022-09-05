package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.MatchDAO;
import com.modelo.entidades.Duenio;
import com.modelo.entidades.Mascota;
import com.modelo.entidades.Match;

public class JPAMatchDAO extends JPAGenericDAO<Match, Integer> implements MatchDAO{

	public JPAMatchDAO() {
		super(Match.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Match> getMatches(int id) { //id de la mascota pretendida
		List<Match> lista = new ArrayList<Match>();
		// obtener la mascota pretendida
		Mascota miMascota = DAOFactory.getFactory().getMascotaDAO().getById(id);
		// obtener el duenio de la mascota pretendida
		//Duenio duenioPretendido = miMascota.getDuenio();
		
		String sentenceJPQL = "SELECT m from Match m WHERE m.pretendido= :param_id";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_id", miMascota);
		try {
			lista = query.getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
