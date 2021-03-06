package com.github.remartins.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

@Transactional
public abstract class AbstractRepository<E> {

	@Inject
	private EntityManager em;

	public E persist(E entity) {
		//em.getTransaction().begin();
		em.persist(entity);
		//em.getTransaction().commit();
		return entity;
	}

}
