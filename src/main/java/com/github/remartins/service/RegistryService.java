package com.github.remartins.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.github.remartins.entity.Registry;
import com.github.remartins.repository.RegistryRepository;

@ApplicationScoped
public class RegistryService {

	@Inject
	private RegistryRepository repository;

	public Registry save(Registry registry) {
		repository.persist(registry);
		return registry;
	}

}
