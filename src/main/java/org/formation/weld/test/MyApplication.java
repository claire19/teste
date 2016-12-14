package org.formation.weld.test;

import javax.inject.Inject;

import org.formation.weld.model.Customer;
import org.formation.weld.service.IService;

public class MyApplication {

	@Inject
	private IService service;
	
	public void showMeTheCustomer() {
		Customer customer = service.getValidatedCustomer();	
		System.out.println(customer);
	}

}
