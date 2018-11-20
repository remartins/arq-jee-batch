package com.github.remartins.batch;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.github.remartins.entity.Registry;
import com.github.remartins.service.RegistryService;

@ApplicationScoped
public class RegistryBatch {

	@Inject
	private RegistryService service;
	
	public void start() {
		
		Registry registry = new Registry();
		registry.setName("nome");
		registry.setDescription("descrição teste");
		
		service.save(registry);
		
		System.out.println(registry.getId());
	}
	
}
