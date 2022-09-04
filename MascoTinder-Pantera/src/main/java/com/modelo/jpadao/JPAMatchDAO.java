package com.modelo.jpadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.MatchDAO;
import com.modelo.entidades.Match;

public class JPAMatchDAO extends JPAGenericDAO<Match, Integer> implements MatchDAO{

	public JPAMatchDAO() {
		super(Match.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Match> getMatches() {
		List<Match> lista = new ArrayList<Match>();
		String sentenceJPQL = "SELECT m from Match m";
		//TypedQuery <Mascota> query = this.em.createQuery(sentenceJPQL, Mascota.class);
		//lista = query.getResultList();
		Query query = this.em.createQuery(sentenceJPQL);
		try {
			lista = query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
