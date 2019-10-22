package com.ranjeet.springmvc.dao;

import java.util.List;

import com.ranjeet.springmvc.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);
}
