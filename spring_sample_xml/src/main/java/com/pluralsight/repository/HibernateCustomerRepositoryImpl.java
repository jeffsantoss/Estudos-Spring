package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;


public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;
	
	@Override
	public List<Customer> findAll() {
		
		System.out.println(this.dbUserName);
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
