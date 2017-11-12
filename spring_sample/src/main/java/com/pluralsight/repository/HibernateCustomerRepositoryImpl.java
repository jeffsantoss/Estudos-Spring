package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;


public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer bryan = new Customer();
		bryan.setFirtsName("Byan");
		bryan.setLastName("Hansen");
		
		Customer jeff = new Customer();
		jeff.setFirtsName("Jefferson");
		jeff.setLastName("Santos");
		
		customers.add(bryan);
		customers.add(jeff);
		
		
		return customers;
	}

}
