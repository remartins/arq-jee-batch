package com.github.remartins.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.github.remartins.batch.RegistryBatch;

public class Main {

	public static void main(String[] args) {

		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		container.select(RegistryBatch.class).get().start();
		weld.shutdown();

		System.out.println("close");
		System.exit(0);
	}

}
