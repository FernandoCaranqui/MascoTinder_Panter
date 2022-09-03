package com.modelo.jpadao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.modelo.dao.GenericDAO;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {
	private Class<T> persistenceClass;
	EntityManager  em;
	
	public JPAGenericDAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
		this.em = Persistence.createEntityManagerFactory("jpamascotinder").createEntityManager();
	}
	@Override
	public void create(T instancia) {
		em.getTransaction().begin();
		try {
			em.persist(instancia);
			em.getTransaction().commit();
		} catch (Exception ex) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public void update(T instancia) {
		em.getTransaction().begin();
		try {
			em.merge(instancia);
			em.getTransaction().commit();
		} catch (Exception ex) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public void delete(T instancia) {
		em.getTransaction().begin();
		try {
			em.remove(instancia);
			em.getTransaction().commit();
		} catch (Exception ex) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public T getById(ID id) {
		return em.find(this.persistenceClass, id);
	}
	@Override
	public List<T> get() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<T> get(String[] attributes, String[] values) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<T> get(String[] attributes, String[] values, String order, int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
