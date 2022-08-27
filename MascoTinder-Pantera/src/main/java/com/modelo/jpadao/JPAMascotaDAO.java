package com.modelo.jpadao;

import java.util.List;
import com.modelo.dao.MascotaDAO;
import com.modelo.entidades.Mascota;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO{
	public JPAMascotaDAO() {
		super(Mascota.class);
	}

	@Override
	public Mascota getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mascota> getMascotas() {
		// TODO Auto-generated method stub
		return null;
	}

}
