package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	public String dbUsername;
   
	@Override
	public List<Customer> findAll() {
		System.out.println(this.dbUsername);
		
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
