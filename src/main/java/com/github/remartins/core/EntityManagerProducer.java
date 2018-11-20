package com.github.remartins.core;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer implements Serializable {

	private static final long serialVersionUID = 2805702595665491646L;

	@ApplicationScoped
	@Produces
	public EntityManager createAppEntityManager() {
		return Persistence.createEntityManagerFactory("jpa-persistence").createEntityManager();
	}

	public void closeEntityManager(@Disposes EntityManager manager) {
		if (manager.isOpen()) {
			manager.close();
		}
	}
}
