package org.formation.weld.dao;

import org.formation.weld.dao.NotificationTypeDao.TypeDao;
import org.formation.weld.model.Customer;

@NotificationTypeDao(TypeDao.JDBC)
public class DaotwoImpl implements IDao{

	
	@Override
	public Customer getCustomer() {
		Customer customer = new Customer("Gaetan");
		return customer;
		
	}

}
