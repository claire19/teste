package org.formation.weld.service;

import javax.inject.Inject;

import org.formation.weld.dao.IDao;
import org.formation.weld.dao.NotificationTypeDao;
import org.formation.weld.dao.NotificationTypeDao.TypeDao;
import org.formation.weld.model.Customer;

public class ServiceImpl implements IService {

	@Inject
	@NotificationTypeDao(TypeDao.JDBC)
	private IDao dao;
	
	@Override
	public Customer getValidatedCustomer() {
		Customer customer = dao.getCustomer();
		return customer ;
	}

}
