package com.modelo.jpadao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.modelo.dao.GenericDAO;
import com.modelo.entidades.Persona;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {
	private Class<T> persistenceClass;
	EntityManager  em;
	
	public JPAGenericDAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
		em = Persistence.createEntityManagerFactory("personajpa").createEntityManager();
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

}
