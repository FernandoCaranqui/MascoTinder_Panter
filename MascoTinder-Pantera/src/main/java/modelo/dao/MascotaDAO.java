package modelo.dao;

import java.util.List;

public interface MascotaDAO extends GenericDAO<Mascota, Integer> {
	
	//public Mascota autorizar(String usuario, String password);
	public List<Mascota> getMascotas();
}
