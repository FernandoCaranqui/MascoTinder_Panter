package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.Duenio;

public interface GenericDAO <T, ID>{
	public void create(T instancia);
	public void update(T instancia);
	public void delete (T instancia);
	public T getById(ID id);
	
	public List<T> get();
	public List<T> get(String[] attributes, String[] values); //like + and
	public List<T> get(String[] attributes, String[] values, String order, int index, int size);

}
