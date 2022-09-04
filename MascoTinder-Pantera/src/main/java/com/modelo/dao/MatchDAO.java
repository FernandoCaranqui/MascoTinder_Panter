package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.Match;

public interface MatchDAO extends GenericDAO<Match, Integer> {
	public List<Match> getMatches();
}
