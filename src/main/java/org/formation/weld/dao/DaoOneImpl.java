package org.formation.weld.dao;

import org.formation.weld.dao.NotificationTypeDao.TypeDao;
import org.formation.weld.model.Customer;

@NotificationTypeDao(TypeDao.JPA)
public class DaoOneImpl implements IDao {

	@Override
	public Customer getCustomer() {
		Customer customer = new Customer("Audrey");
		return customer;

	}

}
