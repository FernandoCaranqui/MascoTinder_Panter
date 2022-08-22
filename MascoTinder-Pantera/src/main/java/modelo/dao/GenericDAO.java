package modelo.dao;

import modelo.entidades.Duenio;

public interface GenericDAO <T, ID>{
	public void create(T instancia);
	public void update(T instancia);
	public void delete (T instancia);
	public T getById(ID id);

}
