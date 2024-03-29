package com.ranjeet.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ranjeet.springmvc.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		
		Session curreSession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = curreSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session currSession = sessionFactory.getCurrentSession();
		currSession.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Session currSession = sessionFactory.getCurrentSession();
		Customer customer = currSession.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		
		Session currSession = sessionFactory.getCurrentSession();
		Query theQuery = currSession.createQuery("delete from Customer where id=:Id");
		theQuery.setParameter("Id", id);
		theQuery.executeUpdate();
		
	}

}
